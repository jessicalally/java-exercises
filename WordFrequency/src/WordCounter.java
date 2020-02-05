import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;


public class WordCounter implements Runnable {

  public static final String SHAKESPEARE_WORKS = "./src/shakespeare.txt";
  final String[] text;
  final int indexFrom;
  final int indexTo;
  final Map<String, Integer> sharedCounters;
  private Lock lock = new ReentrantLock();

  public WordCounter(String[] text, int indexFrom, int indexTo,
      Map<String, Integer> sharedCounters) {
    this.text = text;
    this.indexFrom = indexFrom;
    this.indexTo = indexTo;
    this.sharedCounters = sharedCounters;
  }


  public static void main(String[] args) throws FileNotFoundException {
    final String[] text = WordCounter.loadWords(SHAKESPEARE_WORKS);

    final int numberOfThreads = 3; // Your solution should work with any number of threads

    // Here is a simple sequential implementation
    Map<String, Integer> word2count = new HashMap<>();
    Arrays.stream(text).forEach(w -> {
      word2count.merge(w, 1, Integer::sum);
    });

    System.out.println(word2count);
    // Now count in parallel. The map you compute should be equal to word2count (use method equals)
    Map<String, Integer> word2count2 = new HashMap<>();
    WordCounter wc = new WordCounter(text, 0, text.length, word2count2);

    List<Thread> threads = new ArrayList<>();
    IntStream.range(0, numberOfThreads)
        .sequential()
        .forEach(
            i -> {
              Thread t = new Thread(wc);
              threads.add(t);
              t.start();
            });

    threads.forEach(
        v -> {
          try {
            v.join();
          } catch (InterruptedException e) {
          }
        });

    System.out.println(word2count2);
    System.out.println(word2count.equals(word2count2));
  }


  public static String[] loadWords(String txtFile) throws FileNotFoundException {
    Scanner sc = new Scanner(new File(txtFile));
    List<String> words = new ArrayList<>();
    while (sc.hasNextLine()) {
      String line = sc.nextLine();
      Arrays.stream(line.split(" ")).forEach(s -> words.add(s));
    }
    return words.toArray(new String[0]);
  }

  @Override
  public void run() {
    lock.lock();
    IntStream.range(indexFrom, indexTo).forEach(i -> {
      String word = text[i];
      if (sharedCounters.containsKey(word)) {
        int previousCount = sharedCounters.get(word);
        sharedCounters.put(word, previousCount + 1);
      } else {
        sharedCounters.put(word, 0);
      }
    });
    lock.unlock();
  }
}

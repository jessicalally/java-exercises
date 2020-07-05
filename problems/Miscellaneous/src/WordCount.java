import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordCount {

  private static int countWords(String text) {
    int wordCount = 0;
    for (int i = 0; i < text.length(); i++) {
      if (Character.isWhitespace(text.charAt(i)) || text.charAt(i) == '\n') {
        wordCount++;
      }
    }
    return wordCount;
  }

  private static int countChars(String text) {
    int charCount = 0;
    for (int i = 0; i < text.length(); i++) {
      if (Character.isLetterOrDigit(text.charAt(i))){
        charCount++;
      }
    }
    return charCount;
  }

  public static void main(String[] args) throws IOException {
    int lineCount = 0;
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    String line = input.readLine();
    StringBuilder sb = new StringBuilder();
    while (!line.equals("end")) {
      sb.append(line);
      lineCount++;
      line = input.readLine();
    }
    int wordCount = countWords(sb.toString()) + lineCount;
    int charCount = countChars(sb.toString());
    System.out.println("Lines: " + lineCount + "\nWords: " + wordCount + "\nCharacters: " + charCount);
  }

}

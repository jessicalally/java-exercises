import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo<E> {

  public static GenericSet<Integer> readIntegers(int n) throws IOException {
    GenericSet<Integer> genericSet = (n < 10 ? new SpeedEfficientSet<Integer>() : new MemoryEfficientSet<Integer>());
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < n; i++){
      System.out.println("Please enter an int:");
      genericSet.add(Integer.parseInt(br.readLine()));
    }
    System.out.println("Set is: " + genericSet.toString());
    return genericSet;
  }

  public static void main(String[] args) {
    try {
      GenericSet<Integer> set = readIntegers(Integer.parseInt(args[0]));
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter an element, to be tested for membership");
      String nextLine = br.readLine();
      while (!nextLine.equals("^D")){
        System.out.println("Set contains element: " + set.contains(Integer.parseInt(nextLine)));
        System.out.println("Enter an element, to be tested for membership");
        nextLine = br.readLine();
      }
      System.out.println("Goodbye!");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}

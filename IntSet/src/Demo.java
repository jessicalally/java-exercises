import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

  public static IntSet readIntegers(int n) throws IOException{
    IntSet intSet = (n < 10 ? new SpeedEfficientSet() : new MemoryEfficientSet());
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < n; i++){
      intSet.add(Integer.parseInt(br.readLine()));
    }

    return intSet;
  }

  public static void main(String[] args) {
    try {
      readIntegers(Integer.parseInt(args[0]));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}

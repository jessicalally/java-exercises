import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class NumberManipulation {

  public static <T extends Number> Set<T> readNumbers(int n, NumberParser<T> parser) throws IOException {
    Set<T> numbers = new HashSet<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < n; i++){
      System.out.println("Enter a " + parser.typeParsed() + ": ");
      numbers.add(parser.parseNumber(br.readLine()));
    }

    return numbers;
  }

  public static <T extends Number> T addNumbers(Set<T> numbers, NumberAdder<T> adder){
    T result = adder.zero();
    for (T number : numbers){
      result = adder.add(result, number);
    }

    return result;
  }

  public static <T extends Number> Set<Double> displayAsDoubles(Set<T> numbers){
    Set<Double> doubles = new HashSet<>();
    for (T number : numbers){
      doubles.add(number.doubleValue());
    }
    return doubles;
  }

  public static <T extends Number> Set<Integer> displayAsInts(Set<T> numbers){
    Set<Integer> ints = new HashSet<>();
    for (T number : numbers){
      ints.add(number.intValue());
    }
    return ints;
  }

  public static void main(String[] args) throws IOException {
    Set<Integer> ints = readNumbers(5, new IntegerParser());
    Set<Double> doubles = readNumbers(5, new DoubleParser());

    System.out.println(ints);
    System.out.println(doubles);

    System.out.println(addNumbers(ints, new IntegerAdder()));
    System.out.println(addNumbers(doubles, new DoubleAdder()));

    System.out.println(displayAsInts(doubles));
    System.out.println(displayAsDoubles(ints));
  }

}

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleGenerics {

  public static Stream<Integer> restrictToPositiveIntegers(Stream<Number> numbers) {
    return numbers
        .filter(x -> x instanceof Integer)
        .map(x -> (Integer) x)
        .filter(x -> x > 0);
  }

  public static Stream<Integer> restrictToPositiveIntegersBoundedWildcard(
      Stream<? extends Number> numbers) {
    return numbers
        .filter(x -> x instanceof Integer)
        .map(x -> (Integer) x)
        .filter(x -> x > 0);
  }

  public static void main(String[] args) {
    final List<Number> numbers = Arrays.asList(
        5,
        2,
        3.0f,
        -20.0,
        (short) -1,
        -12,
        -200,
        200,
        0);

    final List<Double> floats = Arrays.asList(
        10.0,
        -20.0,
        31.0,
        412.34);

    final List<Integer> integers = Arrays.asList(
        1,
        -1,
        2,
        -2,
        3,
        -3,
        4,
        -4,
        0);

    System.out.println("Positive integers from " + numbers + " are: "
        + restrictToPositiveIntegers(numbers.stream()).collect(Collectors.toList()));

    System.out.println("Positive integers from " + floats + " are: "
        + restrictToPositiveIntegersBoundedWildcard(floats
        .stream())
        .collect(Collectors.toList()));
    System.out.println("Positive integers from " + integers + " are: "
        + restrictToPositiveIntegersBoundedWildcard(integers
        .stream())
        .collect(Collectors.toList()));

  }

}

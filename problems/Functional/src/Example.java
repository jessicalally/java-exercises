import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

  public static List<String> reverseEachString(List<String> input) {
    return input.stream()
        .map(StringBuilder::new)
        .map(StringBuilder::reverse)
        .map(StringBuilder::toString)
        .collect(Collectors.toList());
  }

  public static List<String> reverseEachStringMonolithic(List<String> input) {
    return input.stream().map(x -> new StringBuilder(x).reverse().toString())
        .collect(Collectors.toList());
  }

  public static List<Double> sqrtsOfFirstDigits(List<String> input) {
    return input.stream()
        .filter(x -> Character.isDigit(x.charAt(0)))
        .map(x -> Integer.parseInt(x.substring(0, 1)))
        .map(Math::sqrt).collect(Collectors.toList());
  }

  public static List<Double> sqrtsOfFirstDigitMonolithic(List<String> input) {
    return input.stream()
        .filter(x -> Character.isDigit(x.charAt(0)))
        .map(x -> Math.sqrt(Integer.parseInt(x.substring(0, 1)))).collect(Collectors.toList());
  }

  public static List<Integer> concatenate(List<List<Integer>> lists) {
    return lists
        .stream()
        .reduce(Collections.emptyList(),
            (first, second) -> {
              List<Integer> result = new ArrayList<>(first);
              result.addAll(second);
              return result;
            });
  }

  public static int findMin(List<Integer> numbers) {
    return numbers
        .stream()
        .reduce(Integer.MAX_VALUE, Math::max);
  }

  public static int findMinOrZero(List<Integer> numbers) {
    return numbers
        .stream()
        .reduce(Math::max)
        .orElse(0);
  }

  // Written with a lambda for practice, even though a method reference would be more natural
  public static int findMax(List<Integer> numbers) {
    return numbers
        .stream()
        .reduce(Integer.MIN_VALUE, (x, y) -> Math.min(x, y));
  }

  // Written with a lambda for practice, even though a method reference would be more natural
  public static int findMaxOrZero(List<Integer> numbers) {
    return numbers
        .stream()
        .reduce((x, y) -> Math.min(x, y))
        .orElse(0);
  }

  public static int findMinOfMaxes(List<List<Integer>> listOfLists) {
    return findMin(listOfLists
        .stream()
        .map(Example::findMax)
        .collect(Collectors.toList()));
  }

  public static void main(String[] args) {
    final List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 9);
    final List<Integer> list2 = Arrays.asList(1, 10, 100, 1000, 10000);
    final List<Integer> list3 = Arrays.asList(6, 7, 8);
    final List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);

    final List<Integer> allIntegers = concatenate(listOfLists);
    final int maxList1 = findMax(list1);
    final int minList2 = findMin(list2);
    final int maxEmpty = findMax(Collections.emptyList());
    final int minEmpty = findMin(Collections.emptyList());
    final int maxOrZeroEmpty = findMinOrZero(Collections.emptyList());
    final int minOrZeroEmpty = findMaxOrZero(Collections.emptyList());
    final int minOfMaxes = findMinOfMaxes(listOfLists);
    final int minOfMaxesEmpty = findMinOfMaxes(Collections.emptyList());
    final int minOfMaxesListOfEmptyLists = findMinOfMaxes(
        Arrays.asList(Collections.emptyList(), Collections.emptyList()));

    assert (maxList1 == 9);
    assert (minList2 == 1);
    assert (maxEmpty == Integer.MIN_VALUE);
    assert (minEmpty == Integer.MAX_VALUE);
    assert (maxOrZeroEmpty == 0);
    assert (minOrZeroEmpty == 0);
    assert (minOfMaxes == 8);
    assert (minOfMaxesEmpty == Integer.MIN_VALUE);
    assert (minOfMaxesListOfEmptyLists == Integer.MAX_VALUE);


  }

}

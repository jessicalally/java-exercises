import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Example<T> {

  public static <T> List<T> concatenate(List<List<T>> lists) {
    return lists
        .stream()
        .reduce(Collections.emptyList(), (x, y) -> {
          List<T> result = new ArrayList<>(x);
          result.addAll(y);
          return result;
        });
  }

  public static <S, T> List<ImmutablePair<Optional<S>, Optional<T>>> zip(List<S> first,
      List<T> second) {
    List<ImmutablePair<Optional<S>, Optional<T>>> result = new ArrayList<>();
    for (int i = 0; i < Math.max(first.size(), second.size()); i++) {
      ImmutablePair<Optional<S>, Optional<T>> pair = new ImmutablePair<>(
          i < first.size() ? Optional.of(first.get(i)) : Optional.empty(),
          i < second.size() ? Optional.of(second.get(i)) : Optional.empty());
      result.add(pair);
    }
    return result;
  }

  public static <S, T> List<ImmutablePair<S, T>> flatten(
      List<ImmutablePair<Optional<S>, Optional<T>>> maybePairs, S defaultS, T defaultT) {
    List<ImmutablePair<S, T>> result = new ArrayList<>();
    for (ImmutablePair<Optional<S>, Optional<T>> pair : maybePairs) {
      result.add(new ImmutablePair<>(
          pair.getFirst().isPresent() ? pair.getFirst().get() : defaultS,
          pair.getSecond().isPresent() ? pair.getSecond().get() : defaultT
      ));
    }
    return result;
  }


}

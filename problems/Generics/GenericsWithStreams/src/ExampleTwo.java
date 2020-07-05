import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class ExampleTwo<E> {

  public static <E, C extends Collection<E>> Optional<C> getSmallestCollection(
      List<C> collections) {
    return collections
        .stream()
        .reduce((x, y) -> x.size() < y.size() ? x : y);
  }

}

import java.util.HashSet;
import java.util.Set;

public class SpeedEfficientSet<E> implements GenericSet<E> {

  private Set<E> genericSet;

  public SpeedEfficientSet(){
    this.genericSet = new HashSet<>();
  }

  @Override
  public void add(E x) {
    genericSet.add(x);
  }

  @Override
  public boolean remove(E x) {
    return genericSet.remove(x);
  }

  @Override
  public boolean isEmpty() {
    return genericSet.isEmpty();
  }

  @Override
  public boolean contains(E x) {
    return genericSet.contains(x);
  }

  @Override
  public String toString(){
    return "Speed Efficient Set";
  }
}

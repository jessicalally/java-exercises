import java.util.HashSet;
import java.util.Set;

public class SpeedEfficientSet implements IntSet {

  private Set<Integer> intSet;

  public SpeedEfficientSet(){
    this.intSet = new HashSet<>();
  }

  @Override
  public void add(int x) {
    intSet.add(x);
  }

  @Override
  public boolean remove(int x) {
    return intSet.remove(x);
  }

  @Override
  public boolean isEmpty() {
    return intSet.isEmpty();
  }

  @Override
  public boolean contains(int x) {
    return intSet.contains(x);
  }
}

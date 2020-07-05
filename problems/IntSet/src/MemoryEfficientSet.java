import java.util.ArrayList;
import java.util.List;

public class MemoryEfficientSet implements IntSet {

  private List<Integer> intSet;

  public MemoryEfficientSet(){
    this.intSet = new ArrayList<>();
  }

  @Override
  public void add(int x) {
    if (intSet.contains(x)){
      return;
    }
    intSet.add(x);
  }

  @Override
  public boolean remove(int x) {
    return intSet.remove(Integer.valueOf(x));
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

import java.util.ArrayList;
import java.util.List;

public class MemoryEfficientSet<E> implements GenericSet<E> {

  private List<E> genericSet;

  public MemoryEfficientSet(){
    this.genericSet = new ArrayList<>();
  }

  @Override
  public void add(E x) {
    if (genericSet.contains(x)){
      return;
    }
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
    return "Memory Efficient Set";
  }
}
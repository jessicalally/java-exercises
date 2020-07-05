import java.util.Set;

public class BitSet8 implements BitSet {

  private byte representation;

  public BitSet8() {
    this.representation = 0;
  }

  @Override
  public void add(int x) {
    if (!inRange(x)){
      throw new RuntimeException("Value not in range.");
    }
    representation |= ((byte) 1 << (byte) x);
  }

  @Override
  public void remove(int x) {
    if (contains(x)) {
      representation = (byte) (representation & ((byte) 0 << x));
    }
  }

  @Override
  public boolean contains(int x) {
    return ((1 << x) & representation) != 0;
  }

  @Override
  public void intersectWith(BitSet s) {
    if (s instanceof BitSet8) {
      representation &= ((BitSet8) s).representation;
    } else {
    }
  }

  @Override
  public int maxStorableValue() {
    return Byte.SIZE - 1;
  }

  private boolean inRange(int v){
    return v <= maxStorableValue();
  }
}

public interface BitSet {

  // Add x to the bit set
  // Throw a runtime exception if x is not in range
  void add(int x);

  // If x belongs to the bit set, remove it
  void remove(int x);

  // Return true iff x belongs to the bit set
  boolean contains(int x);

  // Update the bit set to contain only those values
  // also present in s
  void intersectWith(BitSet s);

  // Return the maximum value that the bit set
  // can represent
  int maxStorableValue();


}

public interface GenericSet<E> {

  // Adds the integer x to the set
  void add(E x);

  // If the integer x belongs to the set, it is removed and 'true'
// is returned.  Otherwise 'false' is returned
  boolean remove(E x);

  // Returns true iff the set is empty
  boolean isEmpty();

  // Returns true iff the set contains the integer x
  boolean contains(E x);

}

public interface Node<E> {

  int getNumberOfChildren();
  Node<E> getChild(int childIndex);
  void setChild(int childIndex, Node<E> child);
  E getKey();
  void setKey(E key);

}

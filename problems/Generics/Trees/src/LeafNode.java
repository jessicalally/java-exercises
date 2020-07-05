public class LeafNode<E> extends AbstractNode<E> {

  @Override
  public int getNumberOfChildren() {
    return 0;
  }

  @Override
  public Node<E> getChild(int childIndex) {
    return null;
  }

  @Override
  public void setChild(int childIndex, Node<E> child) {
    assert false;
  }
}

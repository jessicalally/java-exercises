public class BinaryNode<E> extends AbstractNode<E> {

  private Node<E> left;
  private Node<E> right;

  @Override
  public int getNumberOfChildren() {
    return 2;
  }

  @Override
  public Node<E> getChild(int childIndex) {
    if (childIndex == 0){
      return left;
    } else if (childIndex == 1){
      return right;
    }
    assert false;
    return null;
  }

  @Override
  public void setChild(int childIndex, Node<E> child) {
    if (childIndex == 0){
      left = child;
    } else if (childIndex == 1){
      right = child;
    }
    assert false;
  }
}

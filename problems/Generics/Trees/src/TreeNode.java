import com.sun.source.tree.Tree;

public class TreeNode<E> {

  private E key;
  private TreeNode<E>[] children;

  @SuppressWarnings("unchecked")
  public TreeNode(int numberOfChildren) {
    children = (TreeNode<E>[]) new TreeNode[numberOfChildren];
  }

  public int getNumberOfChildren() {
    return children.length;
  }

  public TreeNode<E> getChild(int childIndex) {
    return children[childIndex];
  }

  public void setChild(int childIndex, TreeNode<E> child) {
    children[childIndex] = child;
  }

  public E getKey() {
    return key;
  }

  public void setKey(E key) {
    this.key = key;
  }

  @Override
  public TreeNode<E> clone(){
    TreeNode<E> newNode = new TreeNode<>(getNumberOfChildren());
    newNode.setKey(getKey());
    for (int i = 0; i < getNumberOfChildren(); i++){
      newNode.setChild(i, getChild(i).clone());
    }
    return newNode;
  }

}
public abstract class AbstractNode<E> implements Node<E> {

  private E key;

  @Override
  public E getKey(){
    return key;
  }

  @Override
  public void setKey(E key){
    this.key = key;
  }

  @Override
  public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append(key.toString());
    sb.append("(");
    for (int i = 0; i < getNumberOfChildren(); i++){
      sb.append(getChild(i));
      if (i < getNumberOfChildren() - 1){
        sb.append(", ");
      }
    }
    sb.append(")");
    return sb.toString();
  }

}

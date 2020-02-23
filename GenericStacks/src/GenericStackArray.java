public class GenericStackArray<E> implements GenericStack<E> {

  private E[] stack;
  private int sizeSoFar;
  private static final int SIZE = 100;

  @SuppressWarnings("unchecked")
  // Creates an empty string stack
  public GenericStackArray(){
    this.stack = (E[]) (new Object[SIZE]);
    this.sizeSoFar = 0;
  }

  // If the stack is full, does nothing.
  // Otherwise, pushes the given String on to the top of the stack
  @Override
  public void push(E s){
    if (sizeSoFar < SIZE){
      stack[sizeSoFar] = s;
      sizeSoFar++;
    }
  }

  // If the stack is empty, leaves the stack unchanged and returns
// null.  Otherwise, removes the string that is on the top of
// the stack and returns it
  @Override
  public E pop(){
    if (sizeSoFar > 0){
      sizeSoFar--;
      return stack[sizeSoFar];
    }
    return null;
  }

  // Returns true iff the stack is empty
  @Override
  public boolean isEmpty(){
    return sizeSoFar == 0;
  }

}

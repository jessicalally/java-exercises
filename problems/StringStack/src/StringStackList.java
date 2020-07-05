import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StringStackList implements StringStack{

  private List<String> stack;
  private static final int SIZE = 100;

  // Creates an empty string stack
  public StringStackList(){
    this.stack = new LinkedList<>();
  }

  // If the stack is full, does nothing.
  // Otherwise, pushes the given String on to the top of the stack
  @Override
  public void push(String s){
    if (stack.size() < SIZE) {
      stack.add(s);
    }
  }

  // If the stack is empty, leaves the stack unchanged and returns
// null.  Otherwise, removes the string that is on the top of
// the stack and returns it
  @Override
  public String pop(){
    if (!stack.isEmpty()){
      return stack.remove(stack.size() - 1);
    }
    return null;
  }

  // Returns true iff the stack is empty
  @Override
    public boolean isEmpty(){
    return stack.isEmpty();
  }

}



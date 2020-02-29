import java.util.HashSet;
import java.util.Set;

public class Demo {

  public static void main(String[] args) {
    Set<B> setOfB = new HashSet<B>();
    Set<? extends A> setOfA = setOfB;
  }

  /* If Set<B> was a subclass of Set<A>, it would be valid to
  write setofA.add(setOfB, new A()), which would cause errors
  at runtime since setOfB is not capable of storing elements
  of type A.
   */


}

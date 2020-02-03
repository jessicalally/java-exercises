public class Test {

  public static void main(String[] args) {

    B b = new B();

    C c = new D();
    c.accept(b);

    D d = new D();
    d.accept(b);

  }

}

// Q1: Does the accept method in D override the accept method in C? Explain your answer.

/*
The accept method in D does not override the accept method in C, because they take different classes
as parameters (A in C and B in D). Hence, we overload the accept method, so an object of class D
has two different methods called accept.
 */

// Q2: What will the above code print?

/*
"Accepted object of type A."
"Accepted object of type B."
 */

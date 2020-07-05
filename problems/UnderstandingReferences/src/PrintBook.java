import java.util.HashSet;
import java.util.Set;

public class PrintBook {

  public static void main(String[] args) {

    Set<Book> set = new HashSet<Book>();

    Book book = new Book(1, "C++");

    set.add(book);

    set.add(new Book(2, "Haskell"));
    set.add(new Book(1, "Java"));
    book.setTitle("New C++ book");

    for (Book b : set) {
      System.out.println(b);
    }

  }

}
/*
PrintBook prints the list of books with their ISBN number. It should print:
New C++ book(ISBN: 1)
Haskell(ISBN: 2)
However it will not print Java (ISBN: 1) because, when we add a new object to a Set in Java,
the Set implementation checks whether their is already an object equal to this new object
in the set. We have overwritten the equals() method to state that two objects are equal if
their ISBN numbers are equal, hence the Java book is not added to the Set.
 */
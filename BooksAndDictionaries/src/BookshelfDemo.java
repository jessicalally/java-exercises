public class BookshelfDemo {

  private static void rearrangeBookshelf(Bookshelf bookshelf){
    int index = 0;
    for (int i = 0; i < bookshelf.size(); i++){
      Book book = bookshelf.remove(index);
      if (book instanceof Dictionary){
        bookshelf.addBookOnRightSide(book);
      } else {
        bookshelf.addBook(index, book);
        index++;
      }
    }
  }

  public static void main(String[] args) {
    Bookshelf bookshelf = new Bookshelf();
    bookshelf.addBookOnLeftSide(new Book("000", "Pride and Prejudice", 345));
    bookshelf.addBookOnLeftSide(new Book("001", "War and Peace", 12225));
    bookshelf.addBook(1, new Dictionary("010", "Collins Dictionary", 500, "French", "English", 1300));
    bookshelf.addBookOnRightSide(new Book("011", "A Christmas Carol", 110));
    bookshelf.addBook(2, new Dictionary("100", "Cambridge Dictionary", 600, "Spanish", "English", 1600));
    bookshelf.addBookOnRightSide(new Book ("101", "Jane Eyre", 500));

    bookshelf.printLeftToRight();
    bookshelf.printRightToLeft();

    rearrangeBookshelf(bookshelf);
    bookshelf.printLeftToRight();

  }

}

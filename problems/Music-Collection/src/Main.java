public class Main {

  public static void main(String[] args) {
    Artist tomOdell = new Artist("Tom Odell", Genre.INDIE);
    tomOdell.addRecord("Another Love");
    tomOdell.addRecord("Sparrow");
    tomOdell.addRecord("Real Love", Genre.POP);
    tomOdell.showCatalogue();
    tomOdell.showGenre(Genre.INDIE);
  }
}

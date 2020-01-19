import java.util.ArrayList;
import java.util.List;

public class Artist {

  private String name;
  private List<Record> catalogue;
  private Genre mainGenre;

  public Artist(String name, Genre mainGenre) {
    this.name = name;
    this.mainGenre = mainGenre;
    this.catalogue = new ArrayList<>();
  }

  // Add a record of the given name to the artist's catalogue
  // Use the artist's main genre as the record's genre
  public void addRecord(String name) {
    Record newRecord = new Record(name, mainGenre);
    catalogue.add(newRecord);
  }

  // Add a record of the given name and genre to the artist's
  // catalogue
  public void addRecord(String name, Genre genre) {
    Record newRecord = new Record(name, genre);
    catalogue.add(newRecord);
  }

  // Display the artist's catalogue
  public void showCatalogue() {
    StringBuffer output = new StringBuffer();
    for (Record record : catalogue) {
      output.append(record.getTitle() + " ");
    }
    System.out.println(output.toString());
  }

  // Display the subset of artist's catalogue that falls into
  // the given genre
  public void showGenre(Genre genre) {
    StringBuffer output = new StringBuffer();
    for (Record record : catalogue) {
      if (record.getGenre() == genre) {
        output.append(record.getTitle());
        output.append(" ");
      }
    }
    System.out.println(output.toString());
  }


}

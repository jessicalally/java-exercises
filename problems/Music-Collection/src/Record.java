public class Record {

  private String title;
  private Genre genre;

  public Record(String title, Genre genre) {
    this.title = title;
    this.genre = genre;
  }

  public Genre getGenre() {
    return genre;
  }

  public String getTitle() {
    return title;
  }

}

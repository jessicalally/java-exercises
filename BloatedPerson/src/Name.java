import java.util.StringTokenizer;

public class Name {

  private String forenames;
  private String surname;

  public Name(String forename, String surname) {
    this.forenames = forename;
    this.surname = surname;
  }

  public String getInitials() {
    String result = "";
    StringTokenizer strTok = new StringTokenizer(forenames);
    while (strTok.hasMoreTokens()) {
      result += strTok.nextToken().charAt(0);
    }
    return result + surname.charAt(0);
  }

  @Override
  public String toString() {
    return forenames + ' ' + surname;
  }

}

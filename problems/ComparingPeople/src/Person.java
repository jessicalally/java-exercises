public class Person {

  private String surname;
  private String forename;
  private String telephone;

  public Person(String surname, String forename, String telephone){
    this.surname = surname;
    this.forename = forename;
    this.telephone = telephone;
  }

  public String getSurname(){
    return surname;
  }

  public String getForename(){
    return forename;
  }

  public String getTelephone(){
    return telephone;
  }

}

public class Person {

  private Name name;
  private DateOfBirth dateOfBirth;
  private Address address;
  private NationalInsuranceNumber nationalInsuranceNumber;

  public Person(Name name, DateOfBirth dateOfBirth, Address address,
      NationalInsuranceNumber nationalInsuranceNumber) {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.address = address;
    this.nationalInsuranceNumber = nationalInsuranceNumber;
  }

  public Name getName() {
    return name;
  }

  public DateOfBirth getDateOfBirth() {
    return dateOfBirth;
  }

  public Address getAddress() {
    return address;
  }

  public NationalInsuranceNumber getNationalInsuranceNumber() {
    return nationalInsuranceNumber;
  }

  public boolean sameAddress(Person other) {
    return this.getAddress().equals(other.getAddress());
  }

  @Override
  public String toString() {
    return "Name: " + name + "\n"
        + "DOB: " + dateOfBirth + "\n"
        + "Address: " + address + "\n"
        + "NI: " + nationalInsuranceNumber;

  }

}
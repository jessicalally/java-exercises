public class Address {

  private int houseNumber;
  private String address1;
  private String address2;
  private String postCode;

  public Address(int houseNumber, String address1, String address2, String postCode) {
    this.houseNumber = houseNumber;
    this.address1 = address1;
    this.address2 = address2;
    this.postCode = postCode;
  }

  public boolean equals(Address other) {
    return houseNumber == other.houseNumber
        && address1.equals(other.address1)
        && address2.equals(other.address2)
        && postCode.equals(other.postCode);
  }

  @Override
  public String toString() {
    return houseNumber + " " + address1 + ", " + address2 + ", " + postCode;
  }

}

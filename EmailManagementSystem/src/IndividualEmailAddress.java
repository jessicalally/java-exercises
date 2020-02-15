import java.util.HashSet;
import java.util.Set;

public class IndividualEmailAddress extends EmailAddress {

  private String identifier;

  public IndividualEmailAddress(String identifier){
    this.identifier = identifier;
  }

  public String getIdentifier(){
    return identifier;
  }

  @Override
  public boolean equals(EmailAddress other) {
    return this.getIdentifier().equals(other.getIdentifier());
  }

  @Override
  public int hashCode() {
    return identifier.hashCode();
  }

  @Override
  public Set<EmailAddress> getTargets() {
    Set<EmailAddress> addresses = new HashSet<>();
    addresses.add(this);
    return addresses;
  }
}

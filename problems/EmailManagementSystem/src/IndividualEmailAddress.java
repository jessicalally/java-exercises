import java.util.HashSet;
import java.util.Set;

public class IndividualEmailAddress extends EmailAddress {

  public IndividualEmailAddress(String identifier){
    super(identifier);
  }

  @Override
  protected Set<EmailAddress> getTargets(Set<EmailAddress> alreadySeen) {
    Set<EmailAddress> addresses = new HashSet<>();
    addresses.add(this);
    return addresses;
  }

}

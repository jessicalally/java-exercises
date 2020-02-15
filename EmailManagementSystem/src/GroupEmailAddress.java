import java.util.HashSet;
import java.util.Set;

public class GroupEmailAddress extends EmailAddress {

  private String identifier;
  private Set<EmailAddress> members;

  public GroupEmailAddress(String identifier){
    this.identifier = identifier;
    this.members = new HashSet<>();
  }

  public void addMember(EmailAddress email){
    members.add(email);
  }

  @Override
  public String getIdentifier() {
    return this.identifier;
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
    for (EmailAddress member : members){
      addresses.addAll(member.getTargets());
    }
    return addresses;
  }
}

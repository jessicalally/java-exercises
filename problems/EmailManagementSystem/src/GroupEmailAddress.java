import java.util.HashSet;
import java.util.Set;

public class GroupEmailAddress extends EmailAddress {

  private Set<EmailAddress> members;

  public GroupEmailAddress(String identifier){
    super(identifier);
    members = new HashSet<>();
  }

  public void addMember(EmailAddress email){
    members.add(email);
  }

  @Override
  protected Set<EmailAddress> getTargets(Set<EmailAddress> alreadySeen) {
    Set<EmailAddress> addresses = new HashSet<>();
    if (alreadySeen.contains(this)){
      return addresses;
    }
    alreadySeen.add(this);
    for (EmailAddress member : members){
      addresses.addAll(member.getTargets(alreadySeen));
    }
    return addresses;
  }
}

import java.util.Set;

public abstract class EmailAddress {

  private String identifier;

  public EmailAddress(String identifier){
    this.identifier = identifier;
  }

  public String getIdentifier(){
    return identifier;
  }

  @Override
  public String toString(){
    return identifier;
  }

  @Override
  public boolean equals(Object other){
    return other instanceof EmailAddress
        && ((EmailAddress) other).identifier.equals(identifier);
  }

  @Override
  public int hashCode(){
    return identifier.hashCode();
  }

  protected abstract Set<EmailAddress> getTargets(Set<EmailAddress> alreadySeen);

}

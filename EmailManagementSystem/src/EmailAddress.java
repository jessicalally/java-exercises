import java.util.Set;

public abstract class EmailAddress {

  public abstract String getIdentifier();

  public abstract boolean equals(EmailAddress other);

  public abstract int hashCode();

  public abstract Set<EmailAddress> getTargets();

}

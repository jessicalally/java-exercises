import java.util.HashSet;

public class EmailAddressDemo {

  public static void main(String[] args) {

    GroupEmailAddress friends = new GroupEmailAddress("friends@doc.ic.ac.uk");
    GroupEmailAddress family = new GroupEmailAddress("family@gmail.com");

    IndividualEmailAddress jess = new IndividualEmailAddress("jess@doc.ic.ac.uk");
    IndividualEmailAddress noor = new IndividualEmailAddress("noor@doc.ic.ac.uk");
    IndividualEmailAddress will = new IndividualEmailAddress("will@doc.ic.ac.uk");
    IndividualEmailAddress james = new IndividualEmailAddress("james@doc.ic.ac.uk");
    IndividualEmailAddress adam = new IndividualEmailAddress("adam@doc.ic.ac.uk");
    IndividualEmailAddress matthew = new IndividualEmailAddress("matthew@doc.ic.ac.uk");
    IndividualEmailAddress mum = new IndividualEmailAddress("mum@gmail.com");
    IndividualEmailAddress dad = new IndividualEmailAddress("dad@gmail.com");
    family.addMember(jess);
    family.addMember(mum);
    family.addMember(dad);
    friends.addMember(jess);
    friends.addMember(noor);
    friends.addMember(will);
    friends.addMember(james);
    friends.addMember(adam);
    friends.addMember(matthew);

    System.out.println("All members of family group: " + family.getTargets(new HashSet<>()));
    System.out.println("All members of friends group: " + friends.getTargets(new HashSet<>()));

  }

}

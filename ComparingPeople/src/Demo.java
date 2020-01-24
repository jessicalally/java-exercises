import java.util.HashSet;
import java.util.Set;

public class Demo {

  public static Person findMin(Set<Person> people, PersonComparator comparator){
    Person currentMin = null;
    for (Person person : people){
      if (currentMin == null || comparator.compareTo(person, currentMin) < 0){
        currentMin = person;
      }
    }
    return currentMin;
  }

  public static void main(String[] args) {

    Set<Person> people = new HashSet<>();
    people.add(new Person("Partridge", "Alan", "12345"));
    people.add(new Person("Surname", "Judith", "12354"));
    people.add(new Person("Surname", "Peter", "14253"));
    people.add(new Person("Field", "Tony", "61432"));
    people.add(new Person("Donaldson", "Minty", "25142"));
    people.add(new Person("Donaldson", "Jekyll", "25142"));
    people.add(new Person("Donaldson", "Jekyll", "00000"));

    System.out.println("Smallest by surname: " + findMin(people, new SurnameComparator()));
    System.out.println("Smallest by forename: " + findMin(people, new ForenameComparator()));
    System.out.println("Smallest by NI: " + findMin(people, new TelephoneComparator()));
    System.out.println("Smallest by surname then forename: " + findMin(people,
        new TwoTieredComparator(new SurnameComparator(), new ForenameComparator())));
    System.out.println("Smallest by surname, then forename, then NI: "
        + findMin(people, new TelephoneComparator(new SurnameComparator(),
        new TwoTieredComparator(new ForenameComparator(), new TelephoneComparator()))));

  }

}

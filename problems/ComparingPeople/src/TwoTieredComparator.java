public class TwoTieredComparator implements PersonComparator {

  private final PersonComparator first;
  private final PersonComparator second;

  public TwoTieredComparator(PersonComparator first, PersonComparator second){
    this.first = first;
    this.second = second;
  }

  @Override
  public int compareTo(Person firstP, Person secondP) {
    int x = first.compareTo(firstP, secondP);
    if (x != 0){
      return x;
    } else {
      return second.compareTo(firstP, secondP);
    }
  }
}

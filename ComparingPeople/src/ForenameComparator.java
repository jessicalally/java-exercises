public class ForenameComparator implements PersonComparator {

  @Override
  public int compareTo(Person first, Person second){
    String forenameOne = first.getForename();
    String forenameTwo = second.getForename();

    for (int i = 0; i < Math.min(forenameOne.length(), forenameTwo.length()); i++){
      if (forenameOne.charAt(i) < forenameTwo.charAt(i)){
        return -1;
      } else if (forenameOne.charAt(i) > forenameTwo.charAt(i)){
        return 1;
      }
    }
    return 0;
  }

}

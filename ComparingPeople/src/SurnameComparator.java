public class SurnameComparator implements PersonComparator {

  @Override
  public int compareTo(Person first, Person second){
    String surnameOne = first.getSurname();
    String surnameTwo = second.getSurname();

    for (int i = 0; i < Math.min(surnameOne.length(), surnameTwo.length()); i++){
      if (surnameOne.charAt(i) < surnameTwo.charAt(i)){
        return -1;
      } else if (surnameOne.charAt(i) > surnameTwo.charAt(i)){
        return 1;
      }
    }
    return 0;
  }
}

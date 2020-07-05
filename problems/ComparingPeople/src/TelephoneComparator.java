public class TelephoneComparator implements PersonComparator {

  @Override
  public int compareTo(Person first, Person second){
    String telephoneOne = first.getTelephone();
    String telephoneTwo = second.getTelephone();

    for (int i = 0; i < Math.min(telephoneOne.length(), telephoneTwo.length()); i++){
      if (telephoneOne.charAt(i) < telephoneTwo.charAt(i)){
        return -1;
      } else if (telephoneOne.charAt(i) > telephoneTwo.charAt(i)){
        return 1;
      }
    }
    return 0;
  }

}

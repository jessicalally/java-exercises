public class DateOfBirth {

  private int dayOfBirth;
  private int monthOfBirth;
  private int yearOfBirth;

  public DateOfBirth(int dayOfBirth, int monthOfBirth, int yearOfBirth) {
    this.dayOfBirth = dayOfBirth;
    this.monthOfBirth = monthOfBirth;
    this.yearOfBirth = yearOfBirth;
  }

  public boolean isDateOfBirthValid() {
    if (yearOfBirth < 0) {
      return false;
    }
    if (monthOfBirth < 1 || yearOfBirth > 12) {
      return false;
    }
    if (dayOfBirth < 1) {
      return false;
    }
    switch (monthOfBirth) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        if (dayOfBirth > 31) {
          return false;
        }
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        if (dayOfBirth > 30) {
          return false;
        }
        break;
      default:
        assert monthOfBirth == 2;
        if (dayOfBirth > (isLeapYear() ? 29 : 28)) {
          return false;
        }
    }
    return true;
  }

  private boolean isLeapYear() {
    // Deliberately simplified version of
    // leap year calculation
    return (yearOfBirth % 4 == 0);
  }

  @Override
  public String toString() {
    return dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth;
  }

}

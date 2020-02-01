public class Clock {

  private int seconds;
  private DisplayMode mode;
  protected static int secondsInMin = 60;
  protected static int secondsInHour = 3600;
  private static int hoursInDay = 24;
  private static int secondsInDay = secondsInHour * hoursInDay;


  public Clock(int seconds){
    this(seconds, DisplayMode.secondsSinceMidnight);
  }

  private Clock(int seconds, DisplayMode mode){
    this.seconds = seconds;
    this.mode = mode;
  }

  public int getTime(){
    return this.seconds;
  }

  public Clock(int h, int m, int s){
    this (calcSeconds(h, m, s), DisplayMode.twentyFourHour);
  }

  protected static int calcSeconds(int h, int m, int s){
    return s + (secondsInMin * m) + (secondsInHour * h);
  }

  public void tick(){
    seconds = (seconds + 1) % secondsInDay;
  }

  private int getHours(){
    return Math.floorDiv(seconds, secondsInHour);
  }

  private int getMins(){
    return Math.floorDiv(seconds - (secondsInHour * getHours()), secondsInMin);
  }

  private int getSecs(){
    return seconds - (secondsInHour * getHours()) - (secondsInMin * getMins());
  }

  @Override
  public String toString(){
    if (mode.equals(DisplayMode.twentyFourHour)){
      String result = padding(getHours()) + getHours() + ":"
          + padding(getMins()) + getMins() + ":"
          + padding(getSecs()) + getSecs();

      return result;
    }
    return Integer.toString(seconds);
  }

  private static String padding(int x) {
    return x < 10 ? "0" : "";
  }

}

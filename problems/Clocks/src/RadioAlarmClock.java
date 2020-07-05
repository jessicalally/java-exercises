public class RadioAlarmClock extends AlarmClock {

  private Station station;

  public RadioAlarmClock(int seconds, int alarm, Station station) {
    super(seconds, alarm);
    this.station = station;
  }

  public RadioAlarmClock(int h, int m, int s, int hAlarm, int mAlarm, int sAlarm, Station station) {
    super(h, m, s, hAlarm, mAlarm, sAlarm);
    this.station = station;
  }

  @Override
  public String toString() {
    if (station.equals(Station.None)){
      super.toString();
    }
      return super.toString() + (on ? " " + fiveLive() : "");
  }

  protected String fiveLive(){
    return "...and it's a GOAL!!!";
  }

}

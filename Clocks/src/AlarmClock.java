public class AlarmClock extends Clock {

  protected int alarmTime;
  protected boolean on = false;

  public AlarmClock(int seconds, int alarm) {
    super(seconds);
    alarmTime = alarm;
  }

  public AlarmClock(int h, int m, int s, int hAlarm, int mAlarm, int sAlarm) {
    super(h, m, s);
    on = false;
    alarmTime = calcSeconds(hAlarm, mAlarm, sAlarm);
  }

  public boolean isOn(){
    return this.on;
  }

  @Override
  public void tick() {
    super.tick();
    if (on) {
      assert getTime() != alarmTime;

      int oneMinuteAgo = getTime() - secondsInMin;
      if (oneMinuteAgo < 0) {
        oneMinuteAgo += secondsInMin;
      }

      if (oneMinuteAgo == alarmTime) {
        on = false;
      }
    } else if (getTime() == alarmTime) {
      on = true;
    }
  }

  @Override
  public String toString() {
    return super.toString() + (on ? " " + beep() : "");
  }

  protected String beep() {
    return "BEEP!";
  }
}

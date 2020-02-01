public class AlarmClockDemo {

  public static void main(String[] args) throws InterruptedException {
    AlarmClock clock = new AlarmClock(23,59,50, 23 ,59 ,58);

    for (int i = 0; i < 100000; i++){

      System.out.println("Clock says: " + clock);

      clock.tick();

      Thread.sleep(1000);
    }

  }

}

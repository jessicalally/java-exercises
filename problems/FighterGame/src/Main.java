public class Main {

  public static void main(String[] args) {
    LuckyFighter joe = new LuckyFighter("Joe", "Human Warrior", 16, 12, "aggressive");
    LuckyFighter alex = new LuckyFighter("Alex", "Elf Lord", 18, 6, "defensive");
    System.out.println("At the start of battle, stats are:");
    System.out.println(joe.getStats());
    System.out.println(alex.getStats());
    System.out.println("------------------------------");
    GameEngine ge = new GameEngine();
    ge.simulateBattle(joe, alex);
  }
}

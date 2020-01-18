public class Main {

  public static void main(String[] args) {
    Fighter joe = new Fighter("Joe", "Human Warrior", 16, 12);
    Fighter alex = new Fighter("Alex", "Elf Lord", 18, 6);
    System.out.println("At the start of battle, stats are:");
    System.out.println(joe.getStats());
    System.out.println(alex.getStats());
    System.out.println("------------------------------");
    GameEngine ge = new GameEngine();
    ge.simulateBattle(joe, alex);
  }
}

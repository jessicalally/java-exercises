public class GameEngine {

  public void simulateBattle(LuckyFighter first, LuckyFighter second) {
    while (!first.isDead() && !second.isDead()) {
      int firstScore = first.calculateAttackScore();
      int secondScore = second.calculateAttackScore();
      if (firstScore > secondScore) {
        System.out.println(first.getName() + " hits " + second.getName() + ", stats are:");
        System.out.println(first.getStats());
        System.out.println(second.getStats());
        int damage = second.calculateDamage();
        second.takeDamage(damage);
      } else if (secondScore > firstScore) {
        System.out.println(second.getName() + " hits " + first.getName() + ", stats are:");
        System.out.println(first.getStats());
        System.out.println(second.getStats());
        int damage = first.calculateDamage();
        first.takeDamage(damage);
      } else {
        System.out.println(first.getName() + " draws with " + second.getName());
      }
      System.out.println("------------------------------");
    }
    if (first.isDead()){
      System.out.println("End of battle, " + second.getStats() + " wins!");
    } else {
      System.out.println("End of battle, " + first.getStats() + " wins!");
    }
  }
}

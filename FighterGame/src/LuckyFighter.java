import java.util.Random;

public class LuckyFighter {

  private String name;
  private String type;
  private int skill;
  private int stamina;
  private static final int DAMAGE_VAL = 2;
  private String strategy;
  private int luck;
  private Random rand;


  public LuckyFighter(String name, String type, int skill, int stamina, String strategy) {
    this.name = name;
    this.type = type;
    this.skill = skill;
    this.stamina = stamina;
    this.strategy = strategy;
    this.rand = new Random();
    this.luck = rand.nextInt(18) + 1;
  }

  private boolean testLuck() {
    if (luck == 0) {
      System.out.println(name + " is out of luck!");
      return false;
    }
    int dice1 = rand.nextInt(6) + 1;
    int dice2 = rand.nextInt(6) + 1;
    boolean result = dice1 + dice2 < luck;
    luck--;
    return result;
  }

  public String getName() {
    return name;
  }

  public String getStats() {
    StringBuffer sb = new StringBuffer();
    sb.append(name + " - ");
    sb.append(type + " - ");
    sb.append("skill: " + skill + "; ");
    sb.append("stamina: " + stamina);
    return sb.toString();
  }

  // Reduce the fighter's stamina accordingly
  public void takeDamage(int damage) {
    final int aggressiveResistanceThreshold = 2;
    final int averageResistanceThreshold = stamina / 2;

    if (luck > 0) {
      if ((strategy == "average" && stamina <= averageResistanceThreshold)
          || (strategy == "aggressive" && stamina <= aggressiveResistanceThreshold)
          || (strategy == "defensive")) {

        System.out.println(name + " tries to resist the damage...");

        if (testLuck()) {
          System.out.println("The damage is partially resisted!");
          damage--;
        } else {
          System.out.println("Oh no, the damage is even worse!");
          damage++;
        }
      }
      stamina = Math.max(stamina - damage, 0);
    }
  }

  // Return the number of damage points to be inflicted on opponent
  public int calculateDamage () {
    if (strategy == "aggressive" && luck > 0) {
      System.out.println(name + " goes for an aggressive hit!");
      if (testLuck()) {
        System.out.println("The hit is aggressive!");
        return DAMAGE_VAL * 2;
      } else {
        System.out.println("The hit flounders!");
        return DAMAGE_VAL / 2;
      }
    } else {
      return DAMAGE_VAL;
    }
  }

  // Calculate an attack score for the fighter using the procedure described above
  public int calculateAttackScore () {
    Random random = new Random();
    int dice1 = random.nextInt(6) + 1;
    int dice2 = random.nextInt(6) + 1;
    int attackScore = dice1 + dice2 + skill;
    return attackScore;
  }

  // Determine whether fighter is still alive
  public boolean isDead () {
    return stamina == 0;
  }

}

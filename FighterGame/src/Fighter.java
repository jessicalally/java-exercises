import java.util.Random;

public class Fighter {

  private String name;
  private String type;
  private int skill;
  private int stamina;
  private static final int DAMAGE_VAL = 2;
  private GameEngine ge = new GameEngine();

  public Fighter(String name, String type, int skill, int stamina){
    this.name = name;
    this.type = type;
    this.skill = skill;
    this.stamina = stamina;
  }

  public String getName() {
    return name;
  }

  public String getStats(){
    StringBuffer sb = new StringBuffer();
    sb.append(name + " - ");
    sb.append(type + " - ");
    sb.append("skill: " + skill + "; ");
    sb.append("stamina: " + stamina);
    return sb.toString();
  }

  // Reduce the fighter's stamina accordingly
  public void takeDamage(int damage){
    stamina -= damage;
  }

  // Return the number of damage points to be inflicted on opponent
  public int calculateDamage(){
    if (stamina == 1) {
      return 1;
    } else {
      return DAMAGE_VAL;
    }
  }

  // Calculate an attack score for the fighter using the procedure described above
  public int calculateAttackScore(){
    Random random = new Random();
    int dice1 = random.nextInt(6) + 1;
    int dice2 = random.nextInt(6) + 1;
    int attackScore = dice1 + dice2 + skill;
    return attackScore;
  }

  // Determine whether fighter is still alive
  public boolean isDead(){
    return stamina == 0;
  }

}

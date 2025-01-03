

public class Warrior extends Hero {

  public Warrior(int level, int hp, int mp, int attackPow) {
    super(level, hp, mp, attackPow);
  }

  public static void main(String[] args) {
    Warrior warrior1 = new Warrior(1, 100, 50, 10);
  }

}


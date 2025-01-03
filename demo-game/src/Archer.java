

public class Archer extends Hero {

  public Archer(int level, int hp, int mp, int attackPow) {
    super(level, hp, mp, attackPow);
  }
  
  public static void main(String[] args) {
    Archer archer1 = new Archer(1, 80, 70, 15);
  }
  
}



public class Mage extends Hero {

  public Mage(int level, int hp, int mp, int attackPow) {
    super(level, hp, mp ,attackPow);
  }  

  public static void main(String[] args) {
    Mage mage1 = new Mage(1, 50, 100, 5);
  }
  
}

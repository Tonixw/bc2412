public class Archer extends Hero {
  /*
   * private int indexOfMaxHp = 3; private int indexOfMaxMp = 1; private int indexOfPhysicalAttack = 3; private int indexOfPhysicalDefend = 3; private int indexOfMagicalAttack = 1; private int
   * indexOfMagicalDefend = 1; private int indexOfAgility = 2; private int indexOfCriticalChance = 1; private int indexOfCriticalDamage = 3;
   */

  public Archer(String name, int level, int maxHp, int maxMp,
      int physicalAttack, int physicalDefend, int magicalAttack,
      int magicalDefend, int agility, int criticalChance, int criticalDamage) {
    super(name, level, maxHp, maxMp, physicalAttack, physicalDefend,
        magicalAttack, magicalDefend, agility, criticalChance, criticalDamage);
  }


  public static void main(String[] args) {
    Archer archer1 = new Archer("Ashe", 1, 80, 70, 15, 5, 10, 5, 15, 20, 150);

    System.out.println(archer1.showStatus());
  }

}

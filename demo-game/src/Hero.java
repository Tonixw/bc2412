public abstract class Hero {
  // HP - Health Point
  // MP - Magic Point
  // Level
  // attackPower

  // Method:
  // Presentation: isAlive
  // Action: Level Up: +MaxHP, +MaxMP, + AttackPower

  // Hero is a Parent Class
  // Child Class: Archer, Mage, Warrior

  // attackPower
  // Weapon,

  private int level;
  private int hp;
  private int mp;
  // private int attackPow;
  
  // static final
  // private int MaxHp;
  // private int MaxMp;

  public Hero(int level, int hp, int mp, int attackPow) {
    this.level = level;
    this.hp = hp;
    this.mp = mp;
    // this.attackPow = attackPow;
  }

  public int getLevel() {
    return this.level;
  }

  public int getHp() {
    return this.hp;
  }

  public int getMp() {
    return this.mp;
  }

  /*public int getAttackPow() {
    return this.attackPow;
  }*/

  public void levelUp() {

  }


}



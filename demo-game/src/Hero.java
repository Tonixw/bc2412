public abstract class Hero {
  private String name;
  private int level;
  private int maxHp;
  private int maxMp;
  private int physicalAttack;
  private int physicalDefend;
  private int magicalAttack;
  private int magicalDefend;
  private int agility;
  private int criticalChance;
  private int criticalDamage;

  public Hero(String name, int level, int maxHp, int maxMp,
    int physicalAttack, int physicalDefend, int magicalAttack,
    int magicalDefend, int agility, int criticalChance, int criticalDamage) {
    this.name = name;
    this.level = level;    
    this.maxHp = maxHp;
    this.maxMp = maxMp;
    this.physicalAttack = physicalAttack;
    this.physicalDefend = physicalDefend;
    this.magicalAttack = magicalAttack;
    this.magicalDefend = magicalDefend;
    this.agility = agility;
    this.criticalChance = criticalChance;
    this.criticalDamage = criticalDamage;
}

  public String getName() {
    return this.name;
  }

  public int getLevel() {
    return this.level;
  }

  public int getMaxHp() {
    return this.maxHp;
  }

  public int getMaxMp() {
    return this.maxMp;
  }

  public int getPhysicalAttack() {
    return this.physicalAttack;
  }

  public int getPhysicalDefend() {
    return this.physicalDefend;
  }

  public int getMagicalAttack() {
    return this.magicalAttack;
  }

  public int getMagicalDefend() {
    return this.magicalDefend;
  }

  public int getAgility() {
    return this.agility;
  }

  public int getCriticalChance() {
    return this.criticalChance;
  }

  public int getCriticalDamage() {
    return this.criticalDamage;
  }

  public String showStatus() {
    return "Name: " + this.getName() + " Level: " + this.getLevel() + " HP: "
        + this.getMaxHp() + " MP: " + this.getMaxMp() + " Physical Attack: "
        + getPhysicalAttack() + " Physical Defend: " + getPhysicalDefend()
        + " Magical Attack: " + getMagicalAttack() + " Magical Defend: "
        + getMagicalDefend() + " Agility: " + getAgility()
        + " Critical chance: " + getCriticalChance() + " Critical Damage: "
        + getCriticalDamage();
  }


  /*
   * public int getAttackPow() { return this.attackPow; }
   */

  public void levelUp() {

  }


}



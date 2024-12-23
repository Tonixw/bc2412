public class CoffeeBean{
  private String name;
  private String variety;
  private String region;
  private int growHeight;
  private int monthOfHarvest;

  public CoffeeBean(String name, String variety, String region, int growHeight, int monthOfHarvest) {
    this.name = name;
    this.variety = variety;
    this.region = region;
    this.growHeight = growHeight;
    this.monthOfHarvest = monthOfHarvest;
  }
  public String getName() {
    return this.name;
  }

  public String getVariety() {
    return this.variety;
  }

  public String getRegion() {
    return this.region;
  }

  public int getGrowHeight() {
    return this.growHeight;
  }

  public int getMonthOfHarvest() {
    return this.monthOfHarvest;
  }
  
}

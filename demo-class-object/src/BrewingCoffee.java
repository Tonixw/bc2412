public class BrewingCoffee {
  private String method;
  private String brewingType;
  private int grindingLevel;
  private int waterTemperature;
  private double proportion;
  private double times;

  public BrewingCoffee(String method, String brewingType, int grindingLevel, int waterTemperature, double proportion, double times) {
    this.method = method;
    this.brewingType = brewingType;
    this.grindingLevel = grindingLevel;
    this.waterTemperature = waterTemperature;
    this.proportion = proportion;
    this.times = times;
  }
  
  public String getMethod() {
    return this.method;
  }
  public String getbrewingType() {
    return this.brewingType;
  }
  public int grindingLevel() {
    return this.grindingLevel;
  }
  public int waterTemperature() {
    return this.waterTemperature;
  }
  public double proportion() {
    return this.proportion;
  }
  public double times() {
    return this.times;
  }
  
}

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Human {
  // attribute
  private double height; // instance varible
  private double weight; // instance varible
  private char gender;

  // Can be more than one constructor
  public Human(double height, double weight, char gender){
    this.height = height;
    this.weight = weight;
    this.gender = gender;
  }

  // empty constructor
  public Human() {

  }
  
  // Constructor is same as method. not allow same constructor signature.
  /*public Human(double height) {
    this.height = height;
  /* */

  public double getHeight() {
    return this.height;
  }

  public double getWeight() {
    return this.weight;
  }

  public char getGender() {
    return this.gender;
  }

  public void setHeight(double height) {
    this.height = height;
  }
  public void setWeight(double weight) {
    this.weight = weight;
  }
  public String bmiIndex() {
    double bmiValue = this.bmi();
    if (bmiValue >= 35.00) {
      return "Extremely Obese";
    } else if (bmiValue >= 30.0 && bmiValue < 35) {
      return "Obese";
    } else if (bmiValue >= 25.0 && bmiValue < 30) {
      return "Overweight";
    } else if (bmiValue >= 18.5 && bmiValue < 25) {
      return "Normal";
    } else {
      return "Under Weight";
    }
  }

  // instance method
  public double bmi() { // Human h1 = new Human(1.74, 64) -> h1.bmi()
    return BigDecimal.valueOf(this.weight)
    .divide(BigDecimal.valueOf(Math.pow(this.height, 2.0)), 2, RoundingMode.HALF_UP)
    //.setScale(2, RoundingMode.HALF_DOWN) // for other operation, +, -, *, /
    .doubleValue();
  }

  
  // static method
  public static double bmi2(double height, double weight) {
    return BigDecimal.valueOf(weight)
    .divide(BigDecimal.valueOf(Math.pow(height, 2.0)), 2, RoundingMode.HALF_UP)
    //.setScale(2, RoundingMode.HALF_DOWN) // for other operation, +, -, *, /
    .doubleValue();
  }

  public static void main(String[] args) {
    Human h1 = new Human(1.74, 68, 'M');
    System.out.println(h1.bmi()); // Non-terminating decimal expansion
    System.out.println(h1.bmiIndex());
    System.out.println(Human.bmi2(1.74, 68));

    // Construct object by empty constructor
    Human h2 = new Human();
    System.out.println(h2.getHeight()); // 0.0
    System.out.println(h2.getWeight()); // 0.0
    System.out.println(h2.getGender());

    if (h2.getGender() == '\u0000') { // different to ' '
      System.out.println("char's default value.");
    }

    double x;
    // for local varible, you cannot get the value before initialization
    // System.out.println(x);
  }

}

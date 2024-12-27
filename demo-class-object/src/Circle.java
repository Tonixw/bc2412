import java.math.BigDecimal;

public class Circle {
  private double radius;
  private String color;

  // Constructor
  public Circle (double radius) {
    this.radius = radius;
    //this.color = color;
  }

  // getter
  public double getRadius() {
    return this.radius;
  }
  public String getColor() {
    return this.color;
  }
  // setter
  public void setRadius(double radius) {
    this.radius = radius;
  }
  public double calculateArea() {
    return BigDecimal.valueOf(this.radius)
    .multiply(BigDecimal.valueOf(this.radius))
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue(); // BigDecimal 
  }

  // static method: CANNOT call "this"
  // static method can be placed to any class
  // Design Defination: input -> output
  public static double calculateArea2(double radius) {
    return BigDecimal.valueOf(radius)
    .multiply(BigDecimal.valueOf(radius))
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
  }

  public static void main(String[] args) {
    // area
    Circle c1 = new Circle(3.0);
    // Presentation 
    System.out.println(c1.calculateArea());
    // BigDecimal

    // Formula
    System.out.print(Circle.calculateArea2(3.0));
  }
  
  
}

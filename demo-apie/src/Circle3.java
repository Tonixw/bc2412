import java.math.BigDecimal;

public class Circle3 implements Shape2 {
  private double radius;

  public Circle3(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public double area() {
    return BigDecimal.valueOf(this.radius)
    .multiply(BigDecimal.valueOf(this.radius))
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
  }
  
}

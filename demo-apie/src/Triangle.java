import java.math.BigDecimal;

public class Triangle extends Color{
  private double base;
  private double height;

  public Triangle(String color, double base, double height) {
    super(color);
    this.base = base;
    this.height = height;
  }

  public double getBase() {
    return this.base;
  }

  public double getHeight() {
    return this.height;
  }

  public BigDecimal area() {
    return BigDecimal.valueOf(this.base).multiply(BigDecimal.valueOf(this.height).divide(BigDecimal.valueOf(2)));
  }
  
  public static void main(String[] args) {
    Triangle t11 = new Triangle("blue", 5, 6);
    System.out.println("This is a " + t11.getColor() + " triangle and the area is " + t11.area());
  }
}

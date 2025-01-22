import java.math.BigDecimal;

public class Square2 implements Shape2 {
  private double length;

  public Square2(double length) {
    this.length = length;
  }

  public double area() {
    return BigDecimal.valueOf(this.length)
    .multiply(BigDecimal.valueOf(this.length))
    .doubleValue();
  }

  public static void main(String[] args) {
     Square2.area(20.);
  }

}

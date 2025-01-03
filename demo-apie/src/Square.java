import java.math.BigDecimal;

public class Square extends Color{
  private double length;

  public Square(String color, double length) {
    super(color);
    this.length = length;
  }

  public double getLength() {
    return this.length;
  }


  public BigDecimal area() {
    return BigDecimal.valueOf(this.length).multiply(BigDecimal.valueOf(this.length));
  }
  

  public static void main(String[] args) {
    Square s11 = new Square("yellow", 9.1);
    System.out.println("This is a " + s11.getColor() + " square and it's area is " + s11.area());
  }
}

import java.math.BigDecimal;

public class Square{
  private double length;
  private Color color;

  public Square(Color color, double length) {
    this.color = color;
    this.length = length;
  }

  public double getLength() {
    return this.length;
  }

  public Color getColor() {
    return this.color;
  }


  public BigDecimal area() {
    return BigDecimal.valueOf(this.length).multiply(BigDecimal.valueOf(this.length));
  }
  

  public static void main(String[] args) {
    Square s11 = new Square(Color.YELLOW, 9.1);
    System.out.println("This is a " + s11.getColor() + " square and it's area is " + s11.area());
  }
}

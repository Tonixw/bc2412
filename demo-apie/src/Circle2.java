import java.math.BigDecimal;

public class Circle2 extends Shape { // Parent Class: color
  // Square.class, Triangle.class
  private double radius;

  // If you don't specify the constructorm implicitly you have an empty constructor

  // area() return double
  public Circle2(char color, double radius) {
    // if you don't specify super() here, implicitly you are calling super()
    super(color); // because you have "extends", you have to "super"
    this.radius = radius;
  }
    

  public double getRadius() {
    return this.radius;
  }
@Override
// Overide the parent given method
// compiler will help to check if the parent class have area() method
  public double area() {
    return BigDecimal.valueOf(this.radius)
        .multiply(BigDecimal.valueOf(this.radius))
        .multiply(BigDecimal.valueOf(Math.PI))
        .doubleValue();
  }

  @Override
  public String toString() {
    return"circle["
    + "radius = " + this.radius
    +", color = " + super.getColor()
    +"]";
  }


  public static void main(String[] args) {
    // new Circle(); 
    // after you specify a constructor,
    // then the default constructor will be no longer exists
    Circle2 c11 = new Circle2('R', 3.1);
    System.out.println("This is a " + c11.getColor() + " circle and the radius is " + c11.area());

    System.out.println(c11);
  }


}

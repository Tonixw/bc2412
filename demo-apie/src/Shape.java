public abstract class Shape {
  // abstract class vs class
  // 1. CANNOT create object for abstract class
  // 2. they are both with common attribute for child class
  // 3. abstract class's constructor is for child class to "super"

  private char color;

  public Shape() {

  }

  public Shape(char color) {
    this.color = color;
  }

  public char getColor() {
    return this.color;
  }

  // implicitly public
  // Implication: If the child class cannot provide area implementation, then it is not a shape.
  // ths child class must provide the implemenation of
  abstract double area();

  public static Shape create(char ref) { // S -> Square, C -> Circle
    switch(ref) {
      case 'S':
      return new Square(color, 3.0);
      case 'C':
      return new Circle(color, 4.0);
      default:
      return null;
    }
  }
  
  public static void main(String[] args) {
    Shape.create('C');

    Heros.createArcher();
  }
}

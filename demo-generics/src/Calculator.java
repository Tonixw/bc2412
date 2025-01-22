public class Calculator<T extends Number> { // Byte, Short, Integer, Long, Float, Double
  // if we achieve the same purpose without generics,
  // ByteCalculator.class
  // ShortCalculator.class
  // IntegerCalculator.class
  // LongCalculator.class
  // FloatCalculator.class
  // DoubleCalculator.class
  // NumberClaculator.class
  private T x;
  private T y;

  public Calculator(T x, T y) {
    this.x = x;
    this.y = y;
  }

  // Allow overflow
  public Number sum() {
    if (this.x instanceof Byte && this.y instanceof Byte) {
      return (Byte) this.x + (Byte) this.y;
    } else if (this.x instanceof Short && this.y instanceof Short) {
      return (Short) this.x + (Short) this.y;
    } else if (this.x instanceof Integer && this.y instanceof Integer) {
      return (Integer) this.x + (Integer) this.y;
    } else if (this.x instanceof Long && this.y instanceof Long) {
      return (Long) this.x + (Long) this.y;
    } else if (this.x instanceof Float && this.y instanceof Float) {
      return (Float) this.x + (Float) this.y;
    } else if (this.x instanceof Double && this.y instanceof Double) {
      return (Double) this.x + (Double) this.y;
  }
}
public static void main(String[] args) {
  LoginManager<Byte> calculator = new LoginManager<>(Byte.valueOf("10"), Byte.valueOf("20"));
}
}

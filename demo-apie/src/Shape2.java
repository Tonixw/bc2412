public interface Shape2 {
  // problems:
  // No attribute
  // Before Java 8, no static & no default method
  double area();
  default double claculate() {
    return area() + 3;
  }
  
}

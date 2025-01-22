public interface Walkable {
  // 1. No instance variable
  // 2. All method are absract (interface = 100% abstract)
  // 3. Impicitly public
  // 4. Support "static final" variable
  // 5. No constructor
  // 6. After Java 8, we have default & static method
  int x = 3; // Omplicitly static final
  void walk();

  // After Java 8, we can default instance method
  default void walkFaster() {
    System.out.println("A way to walk faster ...");
  }

  // After Java 8,we can use static method in Interface
  static int calculateDistance() {
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(Walkable.x);
    // Walkable.x = 4; // static final
    System.out.println(calculateDistance());
  }
  
}

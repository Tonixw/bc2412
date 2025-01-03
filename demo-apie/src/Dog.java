public class Dog extends Animal { // extends
  // private String name;

  // constructor (Class CANNOT inherit Parent Constructor)
  public Dog(String name) {
    // this.name = name;
    super(name);
  }
  
  // getter
  // public String getName() {
  //   return this.name;
  // }

  // walk()
  public void walk() {
    System.out.println("Dog is walking ...");
  }

  public static void main(String[] args) {
    Dog dog = new Dog("DEF");
    dog.walk();
    System.out.println(dog.getName());
  }

}

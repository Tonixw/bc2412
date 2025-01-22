public class Animal implements Eatable {
  // common attribute of Cat and Dog
  private String name;

  public Animal() {
    
  }

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  // Contract Content
  @Override
  public void eat() {
    System.out.println("Animal is eating ......");
  }

  public static void main(String[] args) {
    new Animal(); // OK, because it is normal class

    Cat cat = new Cat("Jimmy", 3);
    System.out.println(cat.getName()); // Jimmy

    Animal cat2 = new Cat("mary", 2);
    cat.eat(); // Cat is eating ...
    
    // Rule 1. During the compile time, "Animal cat2" imply the object
    // "Animal cat2" implies the object can be accessed in "Animal Scope"
    // Hide the object instance method walk() & sleep()
    // cat2.sleep();
    // cat2.walk();

    // Rule 2. Runtime
    cat2.eat();// Find the object during runtime.
    // Found that the object actually is a cat object.
    //so cat.eat() -> Cat.class's eat()

    Animal cat3 = new Animal("Vincent");
    cat.eat();

    // cat3.sleep(); // violate Rule 1

    // Cannot place a parent object to a child reference
    // Cat cat4 = new Animal("Lucas");

    // Example 1:
    Animal[] animals = new Animal[4]; // Cat, Dog, Pig
    animals[0] = new Cat("Penny", 2);
    animals[1] = new Dog("Danny");
    animals[2] = new Pig("Yuki", 1);
    animals[3] = new Animal("Ray"); // what if the Animal.class is abstract?

    Cat[] cats = new Cat[3];
    cats[0] = new Cat("123", 2);
    Dog[] dogs = new Dog[2];
    Pig[] pigs = new Pig[2];

    // Example 2
    Shape2[] shapes = new Shape2[3];
    shapes[0] = new Circle3(3.0);
    shapes[1] = new Square2(4);
    shapes[2] = new Square2(6);
    for (Shape2 shape2 : shapes) {
      System.out.println("area=" + shape2.area());
    }

    // Example 3: Downcast
    for (Shape2 shape2: shapes) {
      if (shape2 instanceof Circle3) {
        Circle3 circle3 = (Circle3) shape2;
        System.out.println(circle3.getRadius());
      } else if (shape2 instanceof Square2) {
        Square2 square2 = (Square2) shape2;
        // System.out.println(square2.getLength());
      }
    }

    // Example 4: for Interface
    Eatable cat4 = new Cat("Tommy", 9);
    cat4.eat(); // Cat is eating ...
    // cat4.walk()

    Sleepable[] animals2 = new Sleepable[3];
    animals2[0] = new Cat("Steve", 2);
    animals2[1] = new Dog("Owen");
    // animals2[2] = new Animal(); // Animal didn't implement Eatable
    animals2[1].sleep();
    animals2[0].sleep();
    // animals2[0].eat();

    // Hero[] heros = new Hero[3];
    }
}

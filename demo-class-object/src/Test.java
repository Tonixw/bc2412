public class Test {
  public static void main(String[] args) {
    int x = 3;
    System.out.println(x);
    int[] arr = new int[3];

    String person = "vincent";
    int personAge = 18;

    String person2 = "lucas";
    int personAge2 = 17;

    String[] names = new String[] {"vincent", "luca"};
    int[] ages = new int[] {18, 17};

    Person p1 = new Person("vincent", 18, "vincent@gmail.com");
    System.out.println(p1.getName()); // vincent
    System.out.println(p1.getAge()); // 18
    System.out.println(p1.getEmail());
    Person p2 = new Person("lucas", 17, "lucas@gmail.com");
    System.out.println(p2.getName()); // lucas
    System.out.println(p2.getAge()); // 17
    System.out.println(p2.getEmail());

    Person p3 = p2;
    System.out.println(p3.getName());
    System.out.println(p3.getAge());

    p2.setAge(30);
    System.out.println(p2.getAge());
    System.out.println(p3.getAge());

    Person[] persons = new Person[] {p1, p2, new Person("dicky", 19, "dicky@gmail.com")};
    for (Person p : persons) {
        // vincent, 18, vincent@gmail.com
        System.out.println(p.getName() + ", " + p.getAge() + ", " + p.getEmail());
    }
    String s1 = "hello";
    String[] strings = new String[] {s1, "world"};

}

  
}

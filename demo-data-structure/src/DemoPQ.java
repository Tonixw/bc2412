import java.util.PriorityQueue;

public class DemoPQ {
  public static class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public String getName() {
      return this.name;
    }

    public int getAge() {
      return this.age;
    }

    public void setName(String name) {
      this.name = name;
    }

    public void setAge(int age){
      this.age = age;
    }

    @Override
    public String toString() {
      return this.name + " " + this.age;
    }

      /*@Override
      public int compare(DemoPQ.Person p1, DemoPQ.Person p2){
      if (p1.isElderly())
      return -1;
      if (p2.isElderly())
      return 1;
      return -1; // base return
    }*/
    
}
  public static void main(String[] args) {
    PriorityQueue<String> pq = new PriorityQueue<>();
    pq.add("Vincent");
    System.out.println(pq); // [Vincent]
    pq.add("Oscar");
    System.out.println(pq); // [Oscar, Vincent]
    pq.add("Lucas");
    System.out.println(pq); // [Lucas, Vincent, Oscar] (No ordering)
    System.out.println(pq.size()); // 3

    // For poll(), ordering -> String natural order
    System.out.println(pq.poll()); // Lucas
    System.out.println(pq.poll()); // Oscar
    System.out.println(pq.poll()); // Vincent

    PriorityQueue<Person> pq2 = new PriorityQueue<>(new SortByAge());
    pq2.add(new Person("Vincent",99));
    pq2.add(new Person("Oscar", 79));
    pq2.add(new Person("Lucas", 56));

    System.out.println(pq2);
    System.out.println(pq2.poll());
    System.out.println(pq2.poll());
    System.out.println(pq2.poll());

  }  
}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class DemoQueue {
  public static void main(String[] args) {
    // FIFO
    Queue<String> strings = new LinkedList<>(); // linkedlist -> add/remove head/tail
    strings.add("Oscar"); // addLast
    strings.add("Vincent"); // addLast
    strings.add("Lucas"); // addLast
    System.out.println(strings);

    String head = strings.poll(); // removeFirst
    System.out.println(head);
    System.out.println(strings);

    // Queue Interface hidden lots of functions of LinkedList
    strings.remove(); // similar to poll()

    // look up, not pick up
    System.out.println(strings.peek());
    System.out.println(strings.size());
 
    strings.offer("Jenny");
    Queue<String> qq = new ArrayBlockingQueue<>(3);
    System.out.println(qq.offer("ABD")); // true
    System.out.println(qq.offer("DEF")); // true
    System.out.println(qq.offer("IJK")); // true
    System.out.println(qq.offer("XYZ")); // false

    // for-each support Queue
    for (String s : strings) {
      System.out.println(s);
    }

    List<String> newStrings = new ArrayList<>();
    newStrings.add("AAA");
    newStrings.add("BBB");
    strings.addAll(newStrings);
    System.out.println(strings);


  }
  
}

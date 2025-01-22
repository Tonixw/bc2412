import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

// Solution
// 1. Native Data structure (Atomic)
// 2. Lock the action (synchrinized)
public class DemoThread4 {
  private List<Integer>integers = new Stack<>(); // Polymorphism;
  // private ArrayList<Integer> integers; // Not thread-safe

  public DemoThread4() {
    this.integers = new ArrayList<>();
  }

 // public ArrayList<Integer>getInteger() {
 //   return this.integers;
  //}

  public synchronized boolean add(Integer integer) {
    return this.integers.add(integer);
  }

  public int size() {
    return this.integers.size();
  }
// add 

  public static void main(String[] args) {
    DemoThread4 central = new DemoThread4();

    Runnable addMillionElement = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        central.add(i);
      }
    };

    Thread workerB = new Thread(addMillionElement);
    workerB.start(); // main thread initialize another thread (workerB) to execute the task.
    // The workerB execute the task ONLY

    Thread workerC = new Thread(addMillionElement);
    workerC.start();

    // Main Thread
    try {
      workerB.join();
      workerC.join();
    } catch (InterruptedException e) {

    }
    System.out.println(central.size());
  }
  
  
}

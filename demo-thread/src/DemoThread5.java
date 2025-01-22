import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;

public class DemoThread5 {
  private Map<Integer, String> map; // HashMap is not thread-safe

  public DemoThread5() {
    this.map = Collections.synchronizedMap(new HashMap<>()); // Hashtable
  }

  //public DemoThread5() {
  //  this.map = new ConcurrentHashMap<>(); // HashMap = Array + LinkedList
  //}

  public String put(Integer key, String value) {
    return this.map.put(key, value);
  }

  public int size() {
    return this.map.size();
  }


  public static void main(String[] args) {
    DemoThread5 central = new DemoThread5();

    // put (i, )
    Runnable putEntryTask1 = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        central.put(i, "abc");
      }
    };

    Runnable putEntryTask2 = () -> {
      for (int i = 1_000_000; i < 2_000_000; i++) {
        central.put(i, "abc");
      }
    };

    Thread workerB = new Thread(putEntryTask1);
    workerB.start(); // main thread initialize another thread (workerB) to execute the task.
    // The workerB execute the task ONLY

    Thread workerC = new Thread(putEntryTask2);
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

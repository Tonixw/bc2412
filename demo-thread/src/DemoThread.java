public class DemoThread {

  // main thread (Worker A)
  // Another thread (Worker B)
  public static void main(String[] args) throws Exception{
    int x = 3;
    x++;
    ++x;
    x += 1;
    System.out.println(x); // 6

    // Create another thread.
    // 1. Task, 2. Thread
    Runnable sayHelloTask = () -> System.out.println("Hello!!!");
    StringBuilder sb = new StringBuilder("");
    Runnable concatMillionTime = () -> {
      for (int i = 0; i < 1; i++) {
        sb.append("!");
      }
      System.out.println(sb.length()); // 1, executed by WorkerB
    };
    Thread workerB = new Thread(concatMillionTime);
    workerB.start(); // main thread (workerA) executes new Thread (workerB)
    // main thread proceed its own task
    // System.out.println(sb.length()); // 0 (likely), executed by WorkerA (main thread)

    System.out.println("Program end.");
  }
}
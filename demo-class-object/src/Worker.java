public class Worker {
  private static int workerCount = 0;
  private Supermarket supermarket;

  public Worker(Supermarket supermarket) {
    this.supermarket = supermarket;
    workerCount++;
  }

  // if read private static variable, we should use a static method
  public static int getWorkerCount() {
    return Worker.workerCount;
  }

  public void moveIn(int quantity) {
    supermarket.setAvailableStock(supermarket.getAvailableStock() + quantity);
  }

  public void moveOut(int quantity) {
    supermarket.setAvailableStock(supermarket.getAvailableStock() - quantity);
  }

  
}

public class Supermarket {
  private int availableStock;

  public Supermarket(int availableStock) {
    this.availableStock = availableStock;
  }

  public int getAvailableStock() {
    return this.availableStock;
  }

  public void setAvailableStock(int availableStock) {
    this.availableStock = availableStock;
  }

  public void moveIn(int numOfStock) {
    this.availableStock += numOfStock;
  }

  public void moveOut(int numOfStock) {
    this.availableStock -= numOfStock;
  }

  public static void main(String[] args) {
    Supermarket s1 = new Supermarket(0);
    s1.moveIn(10);
    s1.moveIn(13);
    s1.moveOut(4);
    System.out.println(s1.availableStock);


    // Single Supermarket scienario
  }
  
}

import java.math.BigDecimal;

public class Item {
  private String name;
  private double price;
  private int quantity;

  public Item() {

  }

  public Item(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return this.name;
  }

  public double getPrice() {
    return this.price;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public void addOne() {
    this.quantity++;
  }

  public double totalAmount() {
    return BigDecimal.valueOf(this.price)
    .multiply(BigDecimal.valueOf(this.quantity))
    .doubleValue();
  }

}

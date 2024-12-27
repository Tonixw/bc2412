import java.math.BigDecimal;

public class Order {
  private long id;
  private Item[] items; // address / reference -> item[] array



  public Order(long id) {
    this.items = new Item[0];
  }

  public void addItem(Item item) {
    Item[] newArr = new Item[this.items.length + 1];
    for (int i = 0; i < this.items.length; i++) {
      newArr[i] = this.items[i];
    }
    newArr[newArr.length - 1] = item;
    this.items = newArr;
  }

  public void removeItem(Item item) {
    // resize array - 1
    Item[] newArr = new Item[this.items.length - 1];
    int idx = 0;
    int countTarget = 0;
    for (int i = 0; i < this.items.length; i++) {
      // this.items -> Item array object
      // this.items[i] -> Item Object
      if (this.items[i].equals(item) && countTarget == 0) {
        countTarget++;
        continue;
      }
      newArr[idx++] = this.items[i]; // copy
    }

  }

  public Item[] getItems() {
    return this.items;
  }

  public long getId() {
    return this.id;
  }

  // Order order = new Order(items)
  // order.totalAount
  public double totalAmount() {
    BigDecimal total = BigDecimal.valueOf(0.0);
    for (Item item : items) {
      total = total.add(BigDecimal.valueOf(item.totalAmount()));
    }
    return total.doubleValue();
  }

}

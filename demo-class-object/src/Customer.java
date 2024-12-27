import java.math.BigDecimal;

public class Customer { // Person "has" name,age
  private long id;
  private Order[] orders;

  // 1. Normally Customer can be created without order
  public Customer(long id, Order[] orders) {
    this.id = id;
    this.orders = orders;
  }

  public Customer(long id) {
    this.id = id;
    this.orders = new Order[0];
  }

  // order id -> item[]
  public Item[] getItem(long orderId) {
    for (Order order : this.orders) {
      if (order.getId() == orderId)
        return order.getItems();
    }
    return new Item[0]; // or return null
  }

  // totalOrderAmount by order id
  public double getTotalOrderAmount(long orderId) {
    for (Order order : this.orders) {
      if (order.getId() == orderId)
        return order.totalAmount();
    }
    return -1.0;
  }

  // isVip() -> 100_000 (total amount of all orders)
  public boolean isVip() {
        BigDecimal total = BigDecimal.valueOf(0.0);
    for (Order order : this.orders) {
      total = total.add(BigDecimal.valueOf(order.totalAmount()));
    }
    return total.doubleValue() >= 100_000.0;
  }

  // 2. Customer can place order after become creating the customer account.
  public void placeOrder(Order order) {
    Order[] newOrders = new Order[this.orders.length + 1];
    for (int i = 0; i < this.orders.length; i++) {
      newOrders[i] = this.orders[i];
    }
    newOrders[this.orders.length - 1] = order;
    this.orders = newOrders;
  }

  // getOrders

  public int orderSize() {
    return this.orderSize();
  }

  public long getId() {
    return this.id;
  }

  public Order[] getOrders() {
    return this.orders;
  }

  public static void main(String[] args) {
    // Order[] orders = new Order[3];
    // orders[0] = new Order();
    // orders[1] = new Order();
    // orders[2] = new Order();
    Customer c1 = new Customer(1L);
    Order o1 = new Order(1L);
    o1.addItem(new Item("ABC", 5.4, 5));
    o1.addItem(new Item("DEF", 1.3, 3));
    o1.addItem(new Item("XYZ", 7.9, 8));
    c1.placeOrder(o1);

    Order o2 = new Order(2L);
    o2.addItem(new Item("PPP", 5.3,95));
    o2.addItem(new Item("MMM", 3.4, 4));
    o2.addItem(new Item("NNN", 7.2, 5));
    c1.placeOrder(o2);

    Order o3 = new Order(3L);
    o3.addItem(new Item("VVV", 5.1, 3));
    o3.addItem(new Item("DEF", 9.1, 10));
    o3.addItem(new Item("XYZ", 4.5, 6));
    c1.placeOrder(o3);

    System.out.println(c1.orderSize()); // 3
    System.out.println(c1.getTotalOrderAmount(1L));
    System.out.println(c1.getTotalOrderAmount(2L));
    System.out.println(c1.getTotalOrderAmount(3L));
    System.out.println(c1.isVip());

    Order o4 = new Order(4L);
    o3.addItem(new Item("AAA", 400.0, 300));
    c1.placeOrder(o4);

    System.out.println(c1.isVip());

    System.out.println(c1.getOrders()[0].getItems()[1].getPrice());
    // c1.getOrders -> Order[]
    // so, getOrders[0] -> order
    // so, getOrders[0].getItems() -> Item[]
    // so, getOrders[0].getItems()[1] -> Item
    // so, getOrders[0].getItems()[1] -> double

    System.out.println(c1.getOrders()[0].getItems()[1].totalAmount());
    System.out.println(c1.getOrders()[0].totalAmount());
    System.out.println(c1.getTotalOrderAmount(1));

    /*Item i1 = new Item("apple", 5, 5);
    System.out.println(i1);

    Order o1 = new Order();
    order.addItem(i1);
  /* */}

}

public class LinkedList1 { // A list of integers
  private Node head; // frist node

  // 10 -> 20 -> 30 -> 40

  public LinkedList1() {
  }

    public void add(int value) { // add to tail
      if (this.head == null) {
        this.head = new Node(value);
        return;
      }
      Node first = this.head;
      while (first.next() != null) {
        first = first.next();
      }
      first.setNode(new Node(value));
    }

      public void remove() { // remove the head node.
        if (this.head == null)
        return;
        this.head = this.head.next();
      }
    

      public int size() {
        int count = 0;
        Node first = this.head;
        while(first != null) {
          first = first.next();
          count++;
        }
        return count;
    }

    @Override
    public String toString() {
      Node first = this.head;
      String str = "LinkedList1[";
      while (first != null) {
        str += first.getValue() + ",";
        first = first.next();
      }
      return str.substring(0, str.length() - 1) + "]";
    }

    public static void main(String[] args) {
      LinkedList1 l1 = new LinkedList1();
      System.out.println(l1.size());
      l1.add(20);
      l1.add(10);
      System.out.println(l1.size());
      l1.remove();
      System.out.println(l1.size());
      l1.add(100);
      System.out.println(l1);
    }
  
  
}

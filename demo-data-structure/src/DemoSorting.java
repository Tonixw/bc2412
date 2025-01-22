import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoSorting {
  private int x;
  private int y;

  public static int sum(int x, int y) {
    x = 100;
    y = 200;
    return x + y;
  }

  public static String concat(String x, String y) {
    return x.concat(y);
  }

  // overflow -> int * int -> int
  // long * long -> long -> Long
  public static long multiply(int x, int y) {
    return (long) x * (long) y; // avoid overflow

    // int[] arr = new int[] {10, 2, 9};
    // allZero(arr);
    // In Java, array & all custom types are always pass by reference.
    // Primitive, wrapper class & String are always pass by value (a copy of value)

    /*
     * public static int[] allZero(int[] arr) { //pass by for (int i = 0; i < arr.length; i++) { arr[i] = 0; } }
     */



  }


  public static void main(String[] args) {
    // bubble sort (Nested Loop)

    List<Integer> integers = Arrays.asList(1, 3, 10, -4, 2);
    Collections.sort(integers);
    System.out.println(integers); // [-4, 1, 2, 3, 10]

    // Primitive or Wrapper Class
    int a = 3;
    int b = 4;
    System.out.println(sum(a, b)); // 300, passing a copy of values to the method
    System.out.println(a); // 3, but not 100, because we pass by value for primitive
    System.out.println(b); // 4, but not 200, because we pass by value for primitive

    // Sort string by Collections.sort()

    BigDecimal bd1 = BigDecimal.valueOf(10);
    BigDecimal bd2 = BigDecimal.valueOf(3);
    System.out.println(addBigDecimal(bd1, bd2).doubleValue());
    System.out.println(bd1.doubleValue());
    System.out.println(bd2.doubleValue());
  }

  /*public static void Book changeBookName (Book book) {
    // book.setName("hello");
    return new Book("hello"); // Similar to BigDecimal
  }*/

  // BigDecimal? pass by value OR pass by reference
  // Similar to String
  public static BigDecimal addBigDecimal(BigDecimal original,
      BigDecimal delta) {
    // Can you revise the value inside a BigDecimal Object
    return original.add(delta); // always return a new BigDecimal Object
  }

}

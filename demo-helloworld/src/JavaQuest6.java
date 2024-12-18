//package questions;

public class JavaQuest6 {
  /**
   * Expected output:
   * 0 1 1 2 3 5 8 13 21 ...
   * 
   */
  public static void main(String[] args) {
    int first = 0, second = 1;
    int sum = 0;
    
    // for loop to print first 15 numbers in Fibonacci Sequence
    // a + b = c
    // b + c = d
    // c + d = e
    // .......
    for (int i = 0; i < 15; i++) {
      sum = first + second;
      first = second;
      second = sum;
    System.out.println(first + " ");
    } 
  }
}
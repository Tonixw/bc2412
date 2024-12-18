import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DemoWhileLoop {

  // check if duplicated exists
  public static boolean isDuplicated(int[] arr, int newValue) {
    // code ...
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == newValue)
        return true;
    }
    return false;
  }

  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      System.out.println(i);
    }

    // ! While Loop vs For Loop
    int j = 0; // ! 1. declare the counter outside the loop
    while (j < 3) { // continue criteria
      System.out.println(j);
      j++; // ! 2. flexible to control the j
      j++;
    }

    String s = "hello";
    char target = 'l';
    boolean found = false;
    // for
    for (int k = 0; k < s.length(); k++) {
      if ( s.charAt(k) == target) {
        found = true;
    }
  }
    // while
    int e = 0;
    
    while (e < s.length()) {
      if (s.charAt(e) == target) {
        found = true;
        break;
      }
      e++;
    }
    System.out.println(found);


    // Random
    int number = new Random().nextInt(3) ; // 0-2
    System.out.println(number);

    int marksix = new Random().nextInt(49) + 1; // (0-48) + 1
    System.out.println(marksix);

    int[] marksixArr = new int[6];
    int count = 0;
    int value = 0;
    while (count < 6) {
      value = new Random().nextInt(49) + 1; // 1-49
      if (!isDuplicated(marksixArr, value)) {
        marksixArr[count] = value;
        count++;
      }
    }
    System.out.println(Arrays.toString(marksixArr));
  

  // 1 - 100
  // bomb: 47
  
  // ! Game Start
  // Please pick a number between 1 - 100
  // User: 4
  // Please pick a number between 5 - 100
  // User: 67
  // Please pick a number between 5 - 66
  // User: 47
  // Bomb!

  // while, scanner
  int min = 1;
  int max = 100;
  int bomb = new Random().nextInt(100) + 1;
  System.out.println(bomb);
  int input = -1;
  while (bomb != input) {
    System.out.println("Please pick a number between " + min + "-" + max);
    Scanner scanner = new Scanner(System.in);
    input = scanner.nextInt();
    if (input < min || input > max)
    continue;
    if ( input < bomb) {
      min = input;
    } else {
      max = input;
    }
    } 
    System.out.println("Bomb!");

    
    // min, max
  }

}


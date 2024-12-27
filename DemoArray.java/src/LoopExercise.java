import java.math.BigDecimal;

public class LoopExercise {
  public static void main(String[] args) {
    // 1. Print 6 times hello
    // Use: for loop
    for (int i = 0; i < 6; i++) {
      System.out.println("hello");
    }

    // 2. Expected output: "0,1,2,3,4"
    // Use: for loop
    {
      int x = -1;
      for (int i = 0; i < 5; i++) {
        x = x + 1;
        System.out.println(x);
      }
    }

    // 3. Print even numbers between 2 and 20
    // Use: for loop + if
    for (int i = 1; i < 21; i++) {
      if (i % 2 == 0)
        System.out.println(i);
    }

    // 4. Print the numbers, which can be divided by 3 or 5
    // Use: for loop + if
    for (int i = 0; i < 100; i++) {
      if (i % 3 == 0 || i % 5 == 0)
        System.out.println(i);
    }

    // 5. Sum up the numbers between 0 and 15 and print it
    // Use: for loop
    {
      int sum = 0;
      for (int i = 0; i < 16; i++) {
        sum = sum + i;
      }
      System.out.println(sum);
    }

    // 6. sum up all odd numbers betwen 0 - 10
    // Sum up all even numbers betwen 0 - 10
    // Find the product of evenSum and oddSum
    // Use: for loop + if
    {
      int oddSum = 0;
      int evenSum = 0;
      for (int i = 0; i < 11; i++) {
        if (i % 2 == 0) {
          oddSum = oddSum + i;
        } else {
          evenSum = evenSum + i;
        }
      }
      System.out.println(oddSum * evenSum);
    }

    // 7. Check if 'd' exists in the string.
    // print "d is found."
    // otherwise, print "d is not found."
    {
      String str7 = "ijkabcpodi";
      boolean found = false;
      for (int i = 0; i < str7.length(); i++) {
        if (str7.charAt(i) == 'd') {
          found = true;
          break;
        }
      } if (found == true){
      System.out.println("d is found.");
      } else {
        System.out.println("d is not found.");
      }
    }

    // 8. Check if the string s8b is a substring of s8a
    // print "s8b is a substring."
    // otherwise, print "s8b is not a substring."
    // Use: for loop + if + substring method
    {
      String s8a = "abcba";
      String s8b = "cba";
      boolean found = false;
      for (int i = 0; i < s8a.length() - s8b.length() + 1; i++) {
        if (s8a.substring(i, i + s8b.length()).equals(s8b))
          found = true;
      } if (found == true){
          System.out.println("s8b is a substring");
      } else {
        System.out.println("s8b is not a substring.");
      }
    }

    // 9. Count the number of char value in the given String s9
    // print "count=2"
    // Use: for loop + if
    {
      String s9 = "pampers";
      char c9 = 'p';
      int count = 0;
      for (int i = 0; i < s9.length(); i++) {
        if (s9.charAt(i) == c9)
          count++;
      }
      System.out.println(count);
    }

    // 10. Replace all char value 'x' in the given String array by 'k'
    // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
    // Use: for loop + replace method
    String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};
    for (int i = 0; i < arr10.length; i++)
      System.out.println(arr10[i].replace('x', 'k'));


    // 11. Count the number of Uppercase char value in the given string s11
    // Print "count uppercase=4"
    // Use: for loop + if
    /*
     * {String s11 = "kLKloOOu"; int count = 0; for (int i = 0; i < s11.length(); i++) { if () } }
     */
    // 12. Print the following pattern of * value
    // *****
    // *****
    // *****
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print("*");
      }
    System.out.println();
    }

    // 13. Given a string value s13, each of the char value has its score.
    // Calculate the total score
    // Use: switch + for loop

    // l -> 1 score
    // r -> 3 score
    // d -> 2 score
    // u -> 4 score
    // for other character, -1 score
    {String s13 = "lrlaudbucp";
    int count = 0;
    for (int i = 0; i < s13.length(); i++) {
      switch (i) {
        case 1:
        i = 'l';
        count++;
        case 2:
        i = 'r';
        count += 3;
        case 3:
        i = 'd';
        count += 2;
        case 4:
        i = 'u';
        count += 4;
      }
      }System.out.println(count);
    }

    // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
    long[] arr14 = new long[4];
    arr14[0] = 1;
    arr14[1] = 4;
    arr14[2] = 9;
    arr14[3] = -4;


    // 15. Find the max value and min value in arr14
    // Use One Loop + if
    long max = Integer.MIN_VALUE;
    long min = Integer.MAX_VALUE;
    for (int i = 0; i < arr14.length; i++) {
      if (arr14[i] > max)
      max = arr14[i];
      if (arr14[i] < min)
      min = arr14[i];
    }
    System.out.println(max);
    System.out.println(min);
    

    // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.5
    float[] arr16 = new float[] {0.2f, 0.3f, 0.5f};


    // 17. Add value 0.1 to each of value in array arr16
    // Print: [0.3, 0.4, 0.6]
    // for (int i = 0; i < arr16.length; i++) {

    // 18. Count the number of target strings in the String[]
    String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
    String target = "Tommy";
    // Print "count name=2"
    {int count1 = 0;
    for (int j = 0; j < arr18.length; j++) {
      if (arr18[j] == target)
      count1++;
    }
    System.out.println(count1);

    // 19. swap the max digit and min digit
    // Assumption: each digit value appear once in the String
    // Print: "49280"
    String s19 = "40289";
    char[] arr19 = new char[s19.length()];
    for (int i = 0; i < s19.length(); i++) {
      arr19[i] = s19.charAt(i);
    }
    // ['4', '0', '2', '8', '9']
    int minIndex = -1;
    int maxIndex = -1;
    int min19 = Integer.MAX_VALUE;
    int max19 = Integer.MIN_VALUE;
    for (int i= 0; i < arr19.length; i++) {
      if (arr19[i] > max19) {
        max19 = arr19[i];
        maxIndex = i;
      }
      if (arr19[i] < min19) {
        min19 = arr19[i];
        minIndex = i;
      }
    }
    // swap
    char temp19 = ' ';
    temp19  = arr19[maxIndex];
    arr19[maxIndex] = arr19[minIndex];
    arr19[minIndex] = temp19;
    System.out.println(arr19);

    // 20. Find the longest String in the String array
    // Print "longest=programming"
    String[] arr20 =
        new String[] {"python", "array", "programming", "java", "bootcamp"};
        int maxLength = 0;
        String largest = "";
        for (int i = 0; i < arr20.length; i++){
          if (arr20[i].length()> maxLength)
          maxLength = arr20[i].length(); 
          largest = arr20[i];
  }
        System.out.println(largest);

  }
}
}
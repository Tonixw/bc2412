public class DemoForEachLoop {
  public static void main(String[] args) {
    // for loop, while loop, for-each loop
    int[] arr = new int[] {3, 4, 5};

     // Just get one value for each iteration
    for (int i = 0; i < arr.length; i++) { 
      System.out.println(arr[i]);
    }

    // 3 + 4
    // 4 + 5
    for (int i = 0; i < arr.length - 1; i++) {
      System.out.println(arr[i] + arr[i + 1]);
    }

    int temp = -1;
    for (int i = 0; i < arr.length / 2; i++) {
      temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
    // for-each
    for (int interger : arr) { // Just get one value for each iteration
      System.out.println(interger);
    }

    char[] arr2 = new char[] {'p', 't', 'e'};
    // for-each loop - > "pte"
    String str = "";
    for (char c : arr2) { 
      str + c;
    }
    System.out.println(str);

    String[] arr3 = new String[] {"abc", "ijk", "def"};
    String target = "ijk";
    // true
  }

}

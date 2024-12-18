import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args) {
        int x1 = 3;
        int x2 = 10;
        int x3 = 11;

        // declare array
        int[] arr = new int[3];
        // assign value to array
        arr[0] = 3;
        arr[1] = 10;
        arr[2] = 11;
        // for loop -> read array values
        // print all values, which >= 10
        for (int i = 0; i < arr.length; i++) { // i = 0, 1, 2
            if (arr[i] >= 10) {
                System.out.println(arr[i]);
            }
        }

        // declare double array, length = 5
        // assign value -> 10.4, 4.3, 3.3, 1.9, 9.9
        // Sum up all values in the double array

        double[] y = new double[5];
        y[0] = 10.4;
        y[1] = 4.3;
        y[2] = 3.3;
        y[3] = 1.9;
        y[4] = 9.9;
        double sum = 0;
        for (int i = 0; i < y.length; i++) {
            sum = sum + y[i];
        }
        System.out.println(sum);

        // "abc", "def", "ijk"
        // "abc"
        String[] arr3 = new String[3];
        arr3[0] = "abc";
        arr3[1] = "def";
        arr3[2] = "ijk";
        String target = "abc";
        boolean found = false;
        for (int i = 0; i < arr3.length; i++) {
            if (target.equals(arr3[i])) {
                found = true;
            }
        }
        System.out.println(found);

        char[] arr4 = new char[] {'b', 'c', 'a'};
        // arr4[0] = 'b';
        // arr4[1] = 'c';
        // arr4[2] = 'a';
        int[] ascii = new int[arr4.length];
        for (int i = 0; i < arr4.length; i++) { // 0, 1, 2
            ascii[i] = arr4[i]; // char value -> int variable
        }
        for (int i = 0; i < ascii.length; i++) {
            System.out.println(ascii[i]);
        }

        // convert the char value to int value, and then assign them to a new int array
        // 98,99,97

        // Find the max ascii value in the int array
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ascii.length; i++) {
            if (ascii[i] > max)
                max = ascii[i];
        }
        // Step 1:i = 0, 98 > 0 -> true -> put 98 to max
        // Step 2: i = 1, 99 > 98 -> true -> put 99 to max
        // Step 3: i = 2, 97 > 98 -> false -> exit
        System.out.println(max); // 99

        // Find the min value in the int array
        int[] arr5 = new int[] {9, -8, -99, 98};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] < min)
                min = arr5[i];
        }
        System.out.println(min); // -99

        // array sum
        int[] arr6 = new int[] {9, 8, 99, 98};
        sum = 0;
        for (int i = 0; i < arr6.length; i++) {
            sum = sum + arr6[i];
        }
        System.out.println(sum);

        // swap
        int left = 7;
        int right = 9;
        int temp = left; // back up left
        left = right;
        right = temp;
        System.out.println(left); // 9
        System.out.println(right); // 7

        // array
        int[] arr8 = new int[] {9, -8, 109, 99, 98};
        for (int i = 0; i < arr8.length - 1; i++)
            System.out.println(arr8[i] + arr8[i + 1]);


        // print 1 (9 + -8)
        // print 101 (-8 + 109)
        // ...
        // print 197 (99 + 98)

        // array swap
        int[] arr7 = new int[] {9, -8, 109, 99, 98};
        for (int i = 0; i < arr7.length - 1; i++) {
            if (arr7[i] > arr7[i + 1]) {
                temp = arr7[i];
                arr7[i] = arr7[i + 1];
                arr7[i + 1] = temp;
            }
        }
        System.out.println(arr7[0]);

        // move max value to the tail
        // for loop + swap
        // 9, -8, 109, 99, 98
        // -8, 9, 109, 99, 98
        // -8, 9, 109, 99, 98
        // -8, 9, 99, 109, 98
        // -8, 9, 99, 98, 109


        System.out.println(Arrays.toString(arr7)); // [x, x, x, x, 109]

        Integer[] arr11 = new Integer[] {9, 6, 4};
        // Products for all numbers
        int product = 1;
        for (int i = 0; i < arr11.length; i++) {
            product *= arr11[i];
        }
        System.out.println(product);

        double[] prices = new double[] {8.2, 6.5, 10.5};
        int[] quantities = new int[] {9, 8, 3};
        // 8.2 x 9 + 6.5 x 8 + 10.5 x 3
        double totalAmount = 0.0;
        for (int i = 0; i < prices.length; i++) {
            totalAmount += prices[i] * quantities[i];
        }
        System.out.println(totalAmount); // 157.3

        String s = String.valueOf(123);
        System.out.println(s); // "123"
        s = String.valueOf(true);
        System.out.println(s); // "true"

        System.out.println(String.valueOf('A')); // "A"

        Integer i1 = Integer.valueOf("123");
        System.out.println(i1);

        // Integer i2 = Integer.valueOf("h"); // java.lang.NumberFormatException

        // "hello" -> 'h' 'e' 'l' 'l' 'o'
        char[] chArr = "hello".toCharArray();
        System.out.println(chArr);
        // olleh
        char cTemp;
        for (int i = 0; i < chArr.length / 2; i++) {
            // chArr[i] vs chArr[chArr.length - i]
            cTemp = chArr[i];
            chArr[i] = chArr[chArr.length - 1 - i];
            chArr[chArr.length - 1 - i] = cTemp;
        }
        String result = "";
        for (int i = 0; i < chArr.length; i++) {
            result += chArr[i];
        }
        System.out.println(result); // olleh

        // h -> i, e -> f, l -> m, o -> p
        // ifmmp
        chArr = "hello".toCharArray();
        for (int i = 0; i < chArr.length; i++) {
            chArr[i] = (char) (chArr[i] + 1);
        }
        System.out.println(String.valueOf(chArr)); // "ifmmp", char Array -> String

        // assume we have small letter ONLY
        char[] arr12 = new char[] {'p', 'a', 'p', 'b', 'a', 'p'};
        // more than one loop
        char maxNumChar = ' ';
        int[] counters = new int[26];
        for (int i = 0; i < arr12.length; i++) {
            counters[arr12[i] - 'a']++;
        }
        // for ( int i = 0; i < counters.length; i++){
        // System.out.println(counters[i]);

        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < counters.length; i++) {
            // max = Math.max(counters[i],max);
            if (counters[i] > max2) {
                maxNumChar = (char) (i + 97);
                max2 = counters[i];
            }
        }
        // p - a ->

        System.out.println(maxNumChar); // p



    }
}


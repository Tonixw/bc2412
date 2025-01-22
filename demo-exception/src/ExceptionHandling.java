import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) throws Exception {
        // Avoid
        // 1. ArithmeticException: / by zero
        int q = 0;
        if (q != 0) {
        int x = 10 / q; // ArithmeticException: / by zero
        } else {
            System.out.println("Q is zero.");
        }
        // Handle Exception
        try {
            int a = 10 / q; // Java by defauld throw exception for some scenario (i.E. / 0)
        } catch (ArithmeticException e) {
            System.out.println("Cannot divided by zero.");
        }

        // 2. Nullpointer Exception (NPE)
        String s = null;
        // avoid
        if (s != null)
        System.out.println(s.charAt(0)); // avoid
        String result = null;

        // try & catch
        String input = null;
        if (input != null) {
            concat(input, "abc");
        }

        try {
        concat("hello", "abc"); // method caller
        } catch (IllegalArgumentException e) {
            // 1. catch class
            // 2. when something wrong happen within the try block
            System.out.println("Ignore the bomb.");
        }

        System.out.println("Hello");

        // 3. Integer.parseInt
        String input2 = "-3.";
        int x2 = 0;
        try {
            x2 = Integer.parseInt(input); // from String to int
        } catch (NumberFormatException e) {
            x2 = -1;
        }
        System.out.println(x2); // -1

        // 4. java.lang.ArrayIndexOutOfBoundsException
        String[] arr = new String[] {"abc", "def", "ijk"};
        //System.out.println(arr[3]);
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 5. java.lang.StringIndexOutOfBoundsException
        String s3 = "hello";
        System.out.println(s3.charAt(s3.length() - 1));
    }

    public static String concat(String x, String y) { // x can be null
        if (x == null)
        throw new IllegalArgumentException(); // complain method input parameters
        // throw an object
        return x.concat(y);
    }
}

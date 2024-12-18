public class DemoMethod {

    // ! sum(int x, Int y) -> input parameters
    // ! int -> return type
    // ! "sum(int x, int y)" -> method signature
    public static int sum(int x, int y) {
        int result = x + y;
        return result; // the return value should align to the return type
    }

    // ! Java doesn't allow "different type" for the same method signature
    // public static long sum(int x, int y){
    // }

    // ! Not Allowed: Same Method Signature
    // "sum(int a, int b)" = sum(int x, int y)
    // Same method name + Same Parameter List
    // public static int sum(int a, int b) {
    // return 1;
    // }

    public static double sum(int a, double b) {
        return a + b;
    }

    public static double sum(double a, int b) {
        return a + b;
    }

    public static double sum(int a, String b) {
        return a + Integer.valueOf(b); // int + int -> int -> double
    }

    public static double substract(int x, int y) {
        int result = x - y;
        return result;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        return x / y;
    }

    // source -> "hello"
    // target 'l'
    // return 2
    public static int countCharacter(String source, char target) {
        // toCharArray
        int count = 0;
        for (int i = 0; i < source.length(); i++) {
            if (target == source.charAt(i))
                count++;
        }
        return count;
    }

    public static int totalMinutes(int day) {
        int minutes = 0;
        for (int i = 0; i < day; i++) {
            for (int j = 0; j < 24; j++) {
                minutes += 60;
            }
        }
        return minutes;
    }

    public static int countEven(long[] arr) { // short[]
        int eCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                eCount++;
        }
        return eCount;
    }


    public static void main(String[] args) {
        int x = 3;
        int a = 10;
        int b = 11;
        int y = a + b;
        System.out.println(y); // 21
        a = 19;
        b = 21;
        y = a + b;
        System.out.println(y); // 40

        // call sum() method
        y = sum(10, 11);
        System.out.println(y); // 21
        y = sum(19, 21);
        System.out.println(y); // 40

        double f = a + b;
        f = substract(30, 18);
        System.out.println(f);

        double m = 0;
        m = multiply(9, 9);
        System.out.println(m);

        double d = 0;
        d = divide(4, 3);
        System.out.println(d);


        System.out.println(countCharacter("hello", 'l'));

        sum(1, 2.0); // sum(int x, double y)
        sum(1, 2); // sum(int x, int y)
        System.out.println(countEven(new long[] {3L, 6L, 12L, 16L, 17L}));
    }
}

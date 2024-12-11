public class DemoOperator {
  public static void main(String[] args){
    // + 1
    int x = 3;
    x = x + 1;
    x++;
    ++x;
    x += 1; // += means x = x + 1
    System.out.println(x); // 7

    // - 1
    int y = 10;
    y = y - 1;
    y--;
    --y;
    y -= 1;
    System.out.println(y); // 6

    // + 2
    int b = 20;
    b = b + 2;
    b += 2;
    System.out.println(b); // 24

    // - 2
    int c = 20;
    c = c - 2;
    c -= 2;
    System.out.println(c); // 16 

    // *=, /=
    int m = 5;
    m = m * 2;
    m *= 2;
    System.out.println(m); // 20

    int u = 4;
    u = u / 2;
    u /= 2;
    System.out.println(u); // 1

    int remainder = 10 % 3;
    System.out.println(remainder); // 1

    // ++x vs x++
    int a = 8;
    int result1 = ++a + 3;
    System.out.println(result1); // 12
    // Step 1: a become 9
    // Step 2: a + 3 (9 + 3)
    // Step 3: assign 12 to result1

    int q = 8;
    int result2 = q++ + 3;
    System.out.println(result2); // 11
    System.out.println(q); // 9
    // Step 1: q + 3 (8 + 3)
    // Step 2: assign 11 to result2
    // Step 3: q become 9

    int h = 10;
    int result3 = h++ + ++h + ++h;

    // 11 + 11
    // h -> 12
    // 22 + 13 -> 35
    // h -> 13
    System.out.println(result3); // 35
    System.out.println(h); // 13


    int k = 10;
    int result10= k++ + k++ + ++k + ++k + k++;
    //            (10)+ (11)+ (13)+ (14)+ (14)
    //            (11)  (12)  (13)  (14)  (15)
    System.out.println(result10);
    System.out.println(k);





    // String +=
    String s = "hello";
    System.out.println(s); // hello
    // int + double -> double
    // String + anything -> String

    s+= 'a';
    System.out.println(s); // helloa

    s += 1;
    System.out.println(s); // helloa1

    s += true;
    System.out.println(s); // helloa1true

    int x10 = 5;
    int y10 = 10;
    int z10 = x10 += 3 * y10;
    System.out.println(z10); //35

    int x11 = 3;
    int y11 = (x11++ + 3) * x11++;
    System.out.println(y11); //24
    System.out.println(x11); //5

    // Step 1: 3 + 3
    // STep 2: x11 become 4
    // Step 3: 6 * 4
    // Step 4: assignment
    // Step 5: x11 become 5


  }
}

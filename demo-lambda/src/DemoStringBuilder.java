public class DemoStringBuilder {
  public static void main(String[] args) {
    String s = "hello";
    s += "!!!";
    s += "???";

    s = "";
    long before = System.currentTimeMillis();
    for (int i = 0; i < 100_000; i++) {
      s += "!";
    }
    long after = System.currentTimeMillis();
    System.out.println(after - before); // 223 ms

    StringBuilder sb = new StringBuilder("");
    before = System.currentTimeMillis();
    for (int i = 0; i < 100_000; i++) {
      sb = sb.append("!"); // similar to setter
    }
    System.out.println(sb.length());
    after = System.currentTimeMillis();
    System.out.println(after - before); // 3

    sb = new StringBuilder("abcd");
    sb.reverse(); // String does not have reverse()
    System.out.println(sb); // cba

    System.out.println(sb.charAt(2));
    sb.replace(0, 2, "yy");
    System.out.println(sb);

    sb.deleteCharAt(2);
    System.out.println(sb);

    sb.setCharAt(2, 'o');
    System.out.println(sb);

    sb.insert(1, "!!!");
    System.out.println(sb);
  }
  
}

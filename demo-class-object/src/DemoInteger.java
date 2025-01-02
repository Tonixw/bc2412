public class DemoInteger {
  public static void main(String[] args) {
    Integer x =3;
    Integer x2 = 3;
    // 2 reference, 1 object (Internal Cache)
    System.out.println(System.identityHashCode(x)); // 1841205829
    System.out.println(System.identityHashCode(x2)); // 1841205829

    Integer x3 = new Integer(3);
    System.out.println(System.identityHashCode(x3)); // 1933863327
    Integer x4 = Integer.valueOf(3);
    System.out.println(System.identityHashCode(x4)); // 1841205829

    // Casge Range: -128 to 127
    Integer x5 = 128;
    Integer x6 = 128;
    System.out.println(System.identityHashCode(x5)); // 112810359
    System.out.println(System.identityHashCode(x6)); // 2124308362
    Integer x7 =  new Integer(128);
    Integer x8 = Integer.valueOf(128);
    System.out.println(System.identityHashCode(x7)); // 146589023
    System.out.println(System.identityHashCode(x8)); // 1482968390

    // Same situations for Byte, Short, Long, Character
    Character c1 = 'a';
    Character c2 = 'a';
    System.out.println(System.identityHashCode(c1)); // 344639057
    System.out.println(System.identityHashCode(c2)); // 344639057

    Character c3 = '你';
    Character c4 = '你';
    System.out.println(System.identityHashCode(c3)); // 349885916
    System.out.println(System.identityHashCode(c4)); // 414493378

    Boolean b1 = true;
    Boolean b2 = true;
    System.out.println(System.identityHashCode(b1)); // 1984697014
    System.out.println(System.identityHashCode(b2)); // 1984697014


    // Not Support Internal Cashe: Float & Double
    Double d1 = 10.3;
    Double d2 = 10.3;
    System.out.println(System.identityHashCode(d1)); // 205029188
    System.out.println(System.identityHashCode(d2)); // 1309552426

    Float f1 = 10.3f;
    Float f2 = 10.3f;
    System.out.println(System.identityHashCode(f1)); // 1943105171
    System.out.println(System.identityHashCode(f2)); // 1704856573

    // Most Important !!!!!!
    // >,<,>=,<=,!=,== for Primitive ONLY
    Double d3 = 10.3;
    Double d4 = 10.1;
    if (d3 > 10.0) { // NOT OK!!!!

    }
    if (d3.compareTo(d4) > 0) {
      System.out.println("d3 > d4");
    }
    if (d3.compareTo(d4) < 0) {
      System.out.println("d3 < d4");
    }
    
    Double d5 = 10.1;
    Double d6 = 10.6;
    if (d5.compareTo(d6) < 0)  {
      System.out.println("d5 < d6");
    }

    Double d7 = 10.1;
    Double d8 = 10.1;
    if (d7.equals(d8)) { // d7.compareTo(d8) == 0;
      System.out.println("d7 = d8");
    }

    if (d3 > 3.0) { // 3.0 -> double

    }

    if (d3.compareTo(3.0) > 0) {
      System.out.println("d3 > 3.0");
    }
    // OK


  }
  
}

public class Helloworld {
  public static void main(String[] args) {
    // Comment. Welcome to bootcamp! @#@#@#@
    // ! 2. Data Type ( Primitive)
    //int-> Integer
    // x, dayOfWeeek -> varible
    int x = 3;
    int dayOfWeek = 7;
    // int y = 3.2; //! not OK, y is a varible that can store integer only.

    double y2 = 3.2;
    //double 2w = 10.0; // ! not OK start with number

    //varible Java naming convension
    // caml case: dayOfWeel, y2

    //Re-sassignment
    x = 101; //re-asssign 101 to x
    x = x + 10; // right: 101 + 10, left: assign 111 to x
    x = x - 40; // 111 - 40 -> 71
    x = x * 3; // 71 * 3 -> 213
    x = x / 213; // 213 / 213

    // Print out
    System.out.println(x); // 1
    x = x + 8 *2 / 4 + 1;
    // 8* 2 / 4 -> 4
    // 1 + 4 +1
    // 6
    System.out.println(x); // 6

    x = (x + 2) * 2 / (3 + 1);
    System.out.println(x); // 4

    x = ((x +3) / (6 + 1)) * (x + 1);
    System.out.println(x); // 5

    // divide by 0
    //int f = 10 / 0; // ! error
    //System.out.println(f); 

    // 0 / 10
     // 0

    // divide
    int x2 = 3 / 2;
    // Step 1: 3 -> int value, 2 -> int value
    // Step 2: int value / int value -> int value
    // Step 3 : 3 / 2 -> 1
    // Step 4 : assign 1 (int value) to int type varible (OK!)
    System.out.println(x2); // 1

    double x3 = 3 / 2;
    // Step 1: 3 -> int value, 2 -> int value
    // Step 2: int value / int value -> int value
    // Step 3 : 3 / 2 -> 1
    // Step 4 : assign 1 (int value) to double type varible (conveert 1 to 1.0)
    System.out.println(x3); // 1.0

    double x4 = 3.0 / 2;
    // Step 1: 3 -> double value, 2 -> int value
    // Step 2: double value / int value -> double value
    // Step 3 : 3.0 / 2 -> 1.5
    // Step 4 : assign 1.5 (double value) to double type varible
    System.out.println(x4); // 1.5

    // ! int x5 = 3.0 / 2;
    // Step 1: 3.0 -> double value, 2 -> int value
    // Step 2: double value / int value -> double value
    // Step 3 : 3.0 / 2 -> 1
    // Step 4 : assign 1.5 (double value) to int type varible (downcasting)
    //Java not allow



  }
}

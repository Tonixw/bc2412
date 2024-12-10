public class Exercise20241210 {
  public static void main(String[] args){
    double priceForApple = 7.3;
    double priceForOrange = 6.5;
    int quantityOfApple = 3;
    int quantityOfOrange = 4;

    double totalAmount = priceForApple * quantityOfApple + priceForOrange * quantityOfOrange;

    System.out.println(totalAmount);

    int mathScore = 73;
    int englishScore = 60;
    int historyScore = 61;

    double averageScore = (mathScore + englishScore + historyScore) / 3.0;

    System.out.println(averageScore);

    // byte -> short -> int -> long
    byte maxByte = 127;
    byte minByte = -128;
    
    // int value -> byte
    maxByte = (byte)(maxByte - 2); // Java: is it safe? Not safe
    // byte value + int value -> int value
    // can we assign int value to byte variable? (downcasting)

    System.out.println(maxByte); // -128, overflow

    int x = maxByte; // Java: is it safe?

    // ! Java: (1)Compile time + (2)Run time
    // Java file (.java) -> class file (.class):java code -> byte code (~machine)
      // (1.1) compile fail. for example (missing ; -> syntax error)
      // (1.2) complie success -> class file
    // (2) Java Virtual Machine (JVM) -> convert class file to machine code -> execute machine code 


  }
}
  


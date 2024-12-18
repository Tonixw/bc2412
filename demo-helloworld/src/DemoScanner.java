import java.util.Scanner;

// JDK vs Java Project (load bulit-in tools, String, Primitibes)
//proactively import non-bulit-in tools (Scanner)
public class DemoScanner {
  public static void main(String[] args){
    String s = "abc";
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please in put a number:");
    int num = scanner.nextInt(); //scanner.next
    //num = num * 2;
    //System.out.println("num=" + num); // String + int -> String

    //scanner.nextLine();

    //System.out.println("Please input a String:");
    //String str = scanner.nextLine();
    //System.out.println("str=" + str);
    
    //int num1 = scanner.nextInt();
    //for(int i = 0; i < num1; i++){
      //System.out.println("Hello");
    //}


    // num -> numbers of days
    // for loop
    //int totalHours = 0;
    //for(int i = 0; i < num; i++){
      //totalHours += 24;}
    //System.out.println(totalHours);

    int totalMinutes = 0;
    for ( int i = 0; i < num; i++){
      for ( int j = 0; j < 24; j++)
      totalMinutes += 60;
    }System.out.println(totalMinutes);


  }
  
}

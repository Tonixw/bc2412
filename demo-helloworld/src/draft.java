import java.util.Scanner;

public class draft {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int numberOfDaysInMonth = 0;
    String monthOfName = "Unknown";

    System.out.print("Input a year: ");
    int year = input.nextInt(); // > 0
    boolean leapyear = false;
    for(int i = 0; i < year; i++){
      if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
    leapyear = true;}

    System.out.print("Input a month number: ");
    int month = input.nextInt(); // assume 1 - 12
    for (int i = 0; i < 13; i++) {
      if (month == 1) {
        monthOfName = ("January");
        numberOfDaysInMonth = 31;
      } else if (month == 2) {
        monthOfName = ("February");
        numberOfDaysInMonth = 28;
        if (leapyear = true){numberOfDaysInMonth = 29;}//}else if(leapyear = false){numberOfDaysInMonth =28;}
      } else if (month == 3) {
        monthOfName = ("March");
        numberOfDaysInMonth = 30;
      } else if (month == 4) {
        monthOfName = ("April");
        numberOfDaysInMonth = 30;
      } else if (month == 5) {
        monthOfName = ("May");
        numberOfDaysInMonth = 31;
      } else if (month == 6) {
        monthOfName = ("June");
        numberOfDaysInMonth = 30;
      } else if (month == 7) {
        monthOfName = ("July");
        numberOfDaysInMonth = 31;
      } else if (month == 8) {
        monthOfName = ("August");
        numberOfDaysInMonth = 31;
      } else if (month == 9) {
        monthOfName = ("Septrmber");
        numberOfDaysInMonth = 30;
      } else if (month == 10) {
        monthOfName = ("October");
        numberOfDaysInMonth = 31;
      } else if (month == 11) {
        monthOfName = ("November");
        numberOfDaysInMonth = 30;
      } else if (month == 12) {
        monthOfName = ("December");
        numberOfDaysInMonth = 31;
      }

    }

      System.out.println(
          monthOfName + " " + year + " has " + numberOfDaysInMonth + " days");

  }
  
}
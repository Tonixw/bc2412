public class DemoComparison {
  public static void main(String[] args){

    // >, <, >=, <=, !=, ==
    //"==" -> asking if they are equals
    // "=" -> assignment

    int age = 20;
    boolean isAdult = age > 18; // adult defination
    System.out.println(isAdult);

    double pi = 3.14159;
    boolean isCorrect = pi == 3.14159;
    System.out.println(isCorrect);

    char gender = 'F';
    boolean isMale = gender == 'M';
    System.out.println(isMale);

    float price = 10.2f;
    System.out.println(price != 10.2f); // false
    System.out.println(price != 10.2); // false, during comparsion, convert price to double before comparison

    // ! operator (NOT)
    boolean result = !isAdult;
    System.out.println(result); // false

    if (age >= 18) {
      //do something ...
    }

    if (!(age >= 18 )){// age < 18
    // do something ...
    }

    if (!isAdult){
    // do something ...
    }

    // && AND
    int age2 = 30;
    char gender2 = 'F';
    Boolean result2 = age2 >= 30 && gender2 == 'M';
    // event 1: age 2 >= 30 -> true
    // event 2: gender2 == 'M' -> false
    System.out.println(result2);

    // || OR (true || false)
    boolean result3 = age2 >= 30 || gender == 'M';
    // event 1: age2 >= 30 -> true
    // event 2 :gender2 == 'M' -> false
    System.out.println(result3);


    // || (false || false)
    boolean result4 = age2 < 30 || gender != 'F';
    System.out.println(result4);

    // AND OR (true AND (false OR true))
    boolean result5 = age2 >= 30 && (gender == 'M' || age2 >18);
    System.out.println(result5);
    // Step 1: (gender2 =='M' || age2 > 18) -> false || true -> true
    // Step 2: age2 >= 30 -> true, true && true -> true

    // ! The ordering of event checking is different
    // AND go first
    boolean result6 = age2 >= 30 && gender2 == 'M' || age > 18;
    System.out.println(result6);
    // Step 1: age2 >= 30 && gender2 == 'M' -> true && fales -> false
    // Step 2: true || false -> true



  }
}

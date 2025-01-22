// Function (Java Built-in interface)

import java.util.function.Function;

public class StringLengthFunction implements Function<String, Integer> {
  @Override
  public Integer apply(String s) {
    return s.length();
  }

  public static void main(String[] args) {
    
    // Traditional Class & Interface
    StringLengthFunction slf = new StringLengthFunction();
    System.out.println(slf.apply("hello")); // 5

    // Lambda Expression (runtime define formula)
    Function<String, Integer> stringLengthFunction = s -> s.length();
  }
}



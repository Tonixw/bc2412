import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class DemoMethodReference {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
    numbers.forEach(e -> {
      System.out.println(e + 10);
    });

    // it implies you won't change the value passimg to method
    numbers.forEach(System.out::println);

    // Instance Method
    String s = "hello";
    Supplier<Integer> stringLength = () -> s.length();
    Supplier<Integer> stringLength2 = s::length;

    // Static Method
    Function<String, Integer> stringToInteger = str -> Integer.valueOf(str);
    Function<String, Integer> stringToInteger2 = Integer::valueOf;
  }
  
}

import java.util.Optional;

public class DemoOptional {
  // firstNmae still can be null, but what is this meaning?
  private Optional<String> firstName;
  public static void main(String[] args) {
    // Caller
    // Advantage: Able to avoid null pointer exception
    Optional<String> result = concat("abc", "def");
    if (result.isPresent()) {
      System.out.println(result.get());
    }

  }
  
  // 1. Optional can only be used as a return type of method
  // If you decided to have a return type of Optional,
  // it implies the result may be null
  // if a or b is null, then result is null
  public static Optional<String> concat(String a, String b) {
    if (a == null || b == null)
    return Optional.empty();
    return Optional.of(a.concat(b));
  }

  // 2. Never use optional as input parameter
  // x and y still can be null
  public static String concat(Optional<String> x, Optional<String> y) {
    if (x == null || y == null)
    return null;
    if (!x.isPresent() || !y.isPresent())
    return null;
    return x.get().concat(y.get());

  }
}

import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    strings.add("ABC");
    strings.add("IJK");
    System.out.println(strings.size()); // 2

    // Difference between HashSet and ArrayList
    System.out.println(strings.add("ABC")); // false
    System.out.println(strings.size()); // 2, HashSet avoid duplicate item

    System.out.println(strings.add("XYZ")); // true
    System.out.println(strings.size()); // 3

    strings.remove(new String("XYZ"));
    System.out.println(strings.size()); // 2

    // No remove by index method
    // HashSet cannot be ordering natually.
    // because its underlying data structure is not an array.
    // so, HashSet did not provide remove by index method.
    int targetRemoveIndex = 1;
    String targetRemoveString = null;
    int index = 0;

    for (String s : strings) {
    if (targetRemoveIndex == index) {
      targetRemoveString = s;
      break;
    }
    index++;
  }
  strings.remove(targetRemoveString);
  System.out.println(strings.size()); // 1
}
}

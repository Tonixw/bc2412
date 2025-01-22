import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

  public static class Book{
    private int id;
    private String name;

    public Book(String name, int id) {
    this.name = name;
    this.id = id;
    }

    public String getName() {
      return this.name;
    }

    public int getId() {
      return this.id;
    }

  }
  public static void main(String[] args) {
    // key and value
    HashMap<String, Integer> fruitMap = new HashMap<>();
    // Put an entry to Map
    // Key -> Apple
    fruitMap.put("Apple", 1);
    fruitMap.put("Apple", 3);
    // If the key is same, the entry will be replaced
    System.out.println(fruitMap); // {Apple=3}
    System.out.println(fruitMap.size()); // 1, entry count
    fruitMap.put("APPLE",3);
    System.out.println(fruitMap); // {Apple=3, APPLE=3}
    System.out.println(fruitMap.size()); // 2, entry count

    // According to String.class equals(), "Apple" and "APPLE" are not equals


    for (Map.Entry<String, Integer> entry: fruitMap.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    for (String key : fruitMap.keySet()) {
      System.out.println(key);
    }

    for (Integer value : fruitMap.values()) {
      System.out.println(value);
    }

    // get value by key
    System.out.println(fruitMap.get("APPLE")); // 3
    System.out.println(fruitMap.get("Apple")); // 3

    // contains()
    System.out.println(fruitMap.containsKey("APPLE")); // true
    
    // Find the entry of "Apple", and then + 1 to the integer.
if (fruitMap.containsKey("Apple")) {
  fruitMap.put("Apple", fruitMap.get("Apple") + 1);
}

  Integer value = fruitMap.get("Apple");
  if (value != null) {
    fruitMap.put("Apple", value + 1);
  }
  System.out.println(fruitMap.get("Apple"));

  // Can we put null value to the entry?
  fruitMap.put("ABC", null);
  System.out.println(fruitMap.size());

  // Can we put null key to the entry?
  fruitMap.put(null, 999);
  fruitMap.put(null, 1000);
  System.out.println(fruitMap);
  System.out.println(fruitMap.size());

  System.out.println(fruitMap.containsValue(1000));

  System.out.println(fruitMap.isEmpty()); // false
  System.out.println(fruitMap.getOrDefault("Orange", 0)); // 0
  System.out.println(fruitMap.getOrDefault("Apple", 0)); // 5
  Integer removedEntryValue = fruitMap.remove("APPLE");
  System.out.println(removedEntryValue);

  fruitMap.put("Cherry", fruitMap.getOrDefault("Cherry", 0)+ 1);

    fruitMap.clear();
    System.out.println(fruitMap.size()); // 0, entry count
    System.out.println(fruitMap.isEmpty()); // true

    // 
    HashMap<Integer, Book> bookMap = new HashMap<>();
    // create books and put books in map.
    // 1 ABC
    // 2 IJK
    // 3 DEF
    // print Map szie
    Book b1 = new Book("ABC", 123);
    Book b2 = new Book("IJK", 246);
    Book b3 = new Book("DEF", 369);

    bookMap.put(b1.getId(), b1);
    bookMap.put(b2.getId(), b2);
    bookMap.put(b3.getId(), b3);
    System.out.println(bookMap.size());
    System.out.println(bookMap.get(b3.getName()));
    System.out.println(bookMap.toString());

    // Store the book count
    HashMap<Book, Integer> bookMap2 = new HashMap<>();
    // put some books in map
    // 1 ABC
    // 2 IJK
    // 3 DEF
    // 3 DEF
    bookMap2.put(b1, b1.getId());
    bookMap2.put(b2, b2.getId());
    bookMap2.put(b3, b3.getId());
    bookMap2.put(b3, b3.getId());
    System.out.println(bookMap2.size()); // 3

  }
  
}

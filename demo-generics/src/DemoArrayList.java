import java.util.ArrayList;

public class DemoArrayList {

  // public static <T extends Shape> double totalArea(T[] shapes) {}
  /*public static double totalArea(List<? extends Shape> shapes) {

  }*/

  public static void main(String[] args) {
    // Many String = String[]

    // Array: fixed length
    String[] ss = new String[3];
    String[] ss2 = new String[] {"abc", "ijk", "xyz"};
    // ss2 is an address of the array, ss2[0]
    System.out.println(ss2[1]); // ijk, read the "ijk" position directly
    
    // ArrayList: Variable Length
    // Underlying data structure -> array
    ArrayList<String> strings = new ArrayList<>(); // arr with size 0
    strings.add("ABC"); // arr with size 1
    strings.add("IJK");
    System.out.println(strings.size()); // 2, arr.length
    System.out.println(strings.get(1)); // IJK, jump to the element with index 1 directly

    // Book[]
    ArrayList<Book> books = new ArrayList<>();
    books.add(new Book("AAA"));
    System.out.println(books.get(0));
    System.out.println(books.size());
    books.remove(0);
    System.out.println(books.size());
    books.add(new Book("XYZ"));
    books.remove(new Book("AAA")); // after @Override equals() in Book.class
    // ArrayList.remove(object obj) -> Book.equals()
    // Generics Design ensure the type must contains equals()

    // Requires @Override equals()
    System.out.println(books.contains(new Book("XYZ"))); // true
    System.out.println(books.indexOf(new Book("XYZ"))); // 0
    books.clear(); // Create a new array with size 0
    System.out.println(books.add(new Book("DEF")));
    books.clear();
    System.out.println(books.isEmpty());
    books.add(new Book("ABCD"));

    // Search "ABCD" For loop
    // for-each support ArrayList
    String bookName = "Not Found.";
    boolean found = false;
    for (Book book : books) {
      if (book.getName().contains("BC")) {
        // found = true;
        bookName = book.getName();
        break;
      }
    }
      System.out.println("Book " + bookName + " is available");
    

  }
  
}

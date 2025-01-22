import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {
    public static void main(String[] args) throws Exception {
        // traditional
        int[] arr = new int[] {1, 2, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int integer : arr) {
            System.out.println(integer);
        }

        // int[], Integer[], ArrayList<Integer>
        // Java8 (2014): Stream style -> Stream -> List
        // before Java8: for loop (list)
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        List<Integer> newIntegers = integers.stream() // Stream<Integer>
                .filter(e -> e % 2 == 0) // "e -> e % 2 == 0" -> Predicate
                .collect(Collectors.toList()); // always return new ArrayList

        System.out.println(integers);
        System.out.println(newIntegers);

        // Declare String array with some elements
        // filter string length > 5 and contain 'a'

        List<String> strings = Arrays.asList("abc", "abcd", "abcde", "xyz");
        List<String> newStrings = strings.stream()
                .filter(e -> e.length() < 5 && e.indexOf('a') != -1) // contains or indexOf
                .collect(Collectors.toList());

        System.out.println(strings);
        System.out.println(newStrings);

        // Define a book list
        // filter book name contain "Herny" case insensitive
        List<Book> books = Arrays.asList(new Book("ABC Herry"),
                new Book("IJK HERRY"), new Book("IJK"));
        List<Book> newBooks = books.stream()
                // .filter(e -> "Herry".equalsIgnoreCase(e.getName()))
                .filter(e -> e.getName().toUpperCase().contains("HERRY"))
                .collect(Collectors.toList()); // return new ArrayList<>

        System.out.println(books);
        System.out.println(newBooks);

        // map() : Change the object type, but the quantity of element won't change
        List<String> bookNames = books.stream().map(e -> e.getName())
                .collect(Collectors.toList());
        System.out.println(bookNames);

        // filter + map
        // for loop + if + re-structure
        List<String> newBookName = books.stream()
                .filter(e -> e.getName().toUpperCase().contains("HERRY"))
                .map(e -> e.getName()).collect(Collectors.toList());

        // for loop + if + procedures
        books.stream().filter(e -> e.getName().startsWith("A")).forEach(e -> {
            System.out.println(e.getName());
        });


        // Convert 3 book names to 3 books
        List<String> bookNames2 = List.of("abc", "herry", "def");
        List<Book> newbooks2 = bookNames2.stream().map(e -> new Book(e))
                .collect(Collectors.toList());
        System.out.println(newbooks2);

        // Stream sorted() + Comparator
        // Collections.sort() + Comparator
        // Arrays.sort() + Comparator

        // Integer[] vs int[], int vs Integer
        Integer[] arr2 = new Integer[] {2, 4, -1, 1, -3};
        Arrays.sort(arr2, (i1, i2) -> i1 > i2 ? -1 : 1); // Lambda expression of Comparator
        System.out.println(Arrays.toString(arr2));

        // Integer[] -> Stream<Integer>
        List<Integer> sortedIntegers =
                Arrays.stream(arr2).sorted((i1, i2) -> i1 > i2 ? -1 : 1)
                        .collect(Collectors.toList());
        System.out.println(sortedIntegers); // [4, 2, 1, -1, -3]

        // Fruit
        List<String> fruits =
                Arrays.asList("orange", "apple", "orange", "lemon");
        Set<String> newFruits = fruits.stream().collect(Collectors.toSet());
        System.out.println(newFruits);

        // distinct() -> remove duplicates
        List<String> newFruits2 =
                fruits.stream().distinct().collect(Collectors.toList());
        System.out.println(newFruits2);

        // Stream.class
        /*
         * Stream.of("abc", "def"); Stream<Book> bookss = Stream.of(new Book("abc"), new Book("def")); bookss.filter(e -> e.getName().contains("a")) .collect(Collectors.toList());
         * 
         * List<Book> books3 = bookss.filter(e -> e.getName().contains("a")) .collect(Collectors.toList());
         */

        Stream<String> ss = Stream.empty();
        System.out.println(ss.count());

        Optional<Book> targetBookBox =
                Stream.of(new Book("hjk"), new Book("DMN"))
                        .filter(e -> "abc".equals(e.getName())).findFirst();

        // Optional (Java 8)
        // 1. targetBook never be null
        // 2. targetBook is an Optional Object, so it can Optional method only
        // 3. You have to check the content of Optional Object before using it.
        int x = 10;
        if (targetBookBox.isPresent()) { // something like peek
            Book targetBook = targetBookBox.get();
            System.out.println(targetBook.getName());
            System.out.println(x);
        }

        // Similar to for-each
        targetBookBox.ifPresent(e -> {
            System.out.println(e.getName());
            System.out.println(x);
            // x = 100;
        });

        // Stream for-each
        String name = "oscar";
        Stream.of(100, 200, 300).forEach(e -> {
            System.out.println(e);
            System.out.println(name); // read the name
            // but cannot write the name variable
            // name = "abc";
        });

        String name2 = "OK!";
        for (Integer integer : Stream.of(100, 200, 300)
                .collect(Collectors.toList())) {
            System.out.println(integer);
            name2 = "ijk";
        }

        // Another way to resolve the Optional
        Book targetBook2 = targetBookBox.orElse(new Book("default"));

        Book targetBook3 = targetBookBox
                .orElseThrow(() -> new RuntimeException("Book is not found"));

        Book targetBook4 = targetBookBox.orElseGet(() -> new Book("default")); // similar to orElse

        // of(), ofNullable()
        String name3 = "ABC";
        Optional<String> os1 = Optional.of(name3);
        
        String name4 = null;
        Optional<String> os2 = Optional.ofNullable(name4);

        Optional<String> os3 = Optional.empty();
        if (os3.isPresent()) {
            System.out.println(os3.get());
        } else {
            System.out.println("The String is Null.");
        }

    }

    // Convert from List of Object A (more fields) to List of Object B (less fields)
    public static List<Book> getBookListForSearch(List<Book2> books) {
        return books.stream().map(e -> new Book(e.getName()))
                .collect(Collectors.toList());
    }

    public static class Book2 {
        private String name;
        private double price;

        public Book2(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return this.name;
        }

        public Double getPrice() {
            return this.price;
        }
    }

    public static class Book {
        private String name;

        public Book(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        @Override
        public String toString() {
            return "BOOK[" + "name=" + name + "]";
        }



    }

}

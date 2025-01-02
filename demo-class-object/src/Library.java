public class Library {
  // A library has many books
  // A book has attributes, title & author
  // The library has functions:
    // 1) add a book, return void.
    // 2) removeByTitle, return Book.
    // 3) searchByTitle, return Book[]

    // Librarian (add/remove), Library(search), Book
  private int availableBook;
  private Book[] books;
  // private Librarian librarian;

  // constructor
  public Library() {
    this.books = new Book[0];
  }

  public Book[] getBooks() {
    return this.books;
  }

  public void setBooks() {
    this.books = books;
  }

    // method signatures
  public void addBook (Book book) {
    Book[] books = new Book[this.books.length + 1];
    for (int i = 0; i < this.books.length; i++) {
      books[i] = this.books[i];
    }
    books[books.length - 1] = book;
    this.books = books;
  }

  // Assume remove the first book with same title
  // 1. Remove the item
  // 2. return removed item

  // Pro-reading:
  // 1. Focus negative cases
  // 2. Variable Scope
  public Book removeBook(String title) {
    Book targetRemoveBook = null;
    int targetRemoveIndex = -1;
    for (int i = 0; i < this.books.length; i++) {
      if (this.books[i].getTitle().contains(title)){
        targetRemoveBook = this.books[i]; // write down the address
        targetRemoveIndex = i;
        break;
      }
    }
    if (targetRemoveIndex != -1) {
      Book[] books = new Book[this.books.length - 1];
      for (int i = 0; i < this.books.length; i++) {
        if (i == targetRemoveIndex)
        continue;
      books[i] = this.books[i];
      }
    this.books = books;
    }
    return targetRemoveBook; // if not found, return null
  }

  // Search a sub-string of the title
  // What Book object you are going to return?
  public Book[] searchByTitle(String title) { // Didn't change the value of the this.books
    int count = 0;
    for (int i = 0; i < this.books.length; i++) {
      if (this.books[i].getTitle().contains(title)) 
        count++;
      }
      Book[] books = new Book[count];
      int idx = 0;
      for (int i = 0; i < this.books.length; i++) {
        books[idx++] = this.books[i];
      }
    return books;
  }

  public int size() {
    return this.books.length;
  }

  // Librarian (add/remove), Library(search), Book
  public static void main(String[] args) {
    // Book
    // Library
    // Librarian
    Library lb1 = new Library();
    Librarian lbn = new Librarian(lb1);
    
    lb1.addBook(new Book("ABC", "Tommy"));
    lb1.addBook(new Book("DEF", "Jenny"));

    for (Book book : lb1.getBooks()) {
      System.out.println(book.getTitle() + " " + book.getAuthor());
    }
    // ABC Tommy
    // DEF Jenny
    /*for (Book book : lb1.searchByTitle("BC")) {
      System.out.println(book.);
    }*/

    Book removeBook = lb1.removeBook("DEF");
    System.out.println(removeBook.getTitle() + " " + removeBook.getAuthor());
    System.out.println(lb1.size()); // 1
  }



  
}

public class Librarian {
  private String name;
  private Library library;

  // Librarian -> Library
  // Library -> Librarian
  public Librarian(Library library) {
    this.library = library;
  }

  // add()
  // removeBook()
  public void add(Book book) {
    Book[] books = new Book[this.library.size() + 1];
    for (int i = 0; i < this.library.size(); i++) {
      books[i] = this.library.getBooks()[i];
    }
    books[books.length - 1] = book;
    this.library.setBooks();

  public void remove(Book book) {
    int targetRemoveIndex = -1;
    for (int i = 0; i < this.library.size(); i++) {
      if (this.library.getBooks()[i].getTitle().equals(title)) {
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
  

  }
  
}

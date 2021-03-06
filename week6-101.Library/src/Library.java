import java.util.ArrayList;

public class Library {
    private ArrayList<Book> libraryBooks = new ArrayList<Book>();

    public Library() {

    }

    public void addBook(Book book) {
        this.libraryBooks.add(book);
    }

    public void printBooks() {
        for (Book book :
                this.libraryBooks) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book :
                this.libraryBooks) {
            if (StringUtils.included(book.title(), title)) {
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book :
                this.libraryBooks) {
            if (StringUtils.included(book.publisher(), publisher)) {
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book :
                this.libraryBooks) {
            if (book.year() == year) {
                found.add(book);
            }
        }
        return found;
    }
}

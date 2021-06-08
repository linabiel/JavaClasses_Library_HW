import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book iliad;
    private Book lightFantastic;
    private Book americanGods;
    private Library library;
    private Borrower borrower;

    @Before
    public void before() {
        iliad = new Book("The Iliad", "Homer", "Classical Literature");
        lightFantastic = new Book("Light Fantastic", "Terry Pratchett", "Fantasy Literature");
        americanGods = new Book("American Goods", "Neil Gaiman", "Fantasy Literature");
        library = new Library(2);
        borrower = new Borrower();
    }

    @Test
    public void getNumberOfBooks() {
        library.getBookCount();
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBookToLibrary() {
        library.addBook(iliad);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void canCheckCapacity() {
        library.addBook(iliad);
        library.addBook(lightFantastic);
        library.addBook(americanGods);
        assertEquals(2, library.getBookCount());
    }

    @Test
    public void canLendBook() {
        library.addBook(iliad);
        library.addBook(americanGods);
        library.loanBook(borrower);
        library.loanBook(borrower);
        assertEquals(0, library.getBookCount());
        assertEquals(2, borrower.getCollectionSize());
    }
}

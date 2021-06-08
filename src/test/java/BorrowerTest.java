import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Book book;
    Library library;
    Borrower borrower;

    @Before
    public void before() {
        book = new Book("The Iliad", "Homer", "Classical Literature");
        library = new Library(2);
        borrower = new Borrower();
    }

    @Test
    public void canAddBookToCollection() {
        borrower.addBook(book);
        assertEquals(1, borrower.getCollectionSize());
    }

}

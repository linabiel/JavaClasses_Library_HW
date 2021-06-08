import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity) {
        this.stock = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getBookCount() {
        return this.stock.size();
    }

    public void addBook(Book book) {
        if (checkCapacity()) {
            this.stock.add(book);
        }
    }

    public boolean checkCapacity() {
        return this.capacity > getBookCount();
    }

    public Book removeBook() {
        return this.stock.remove(0);
    }

    public void loanBook (Borrower borrower) {
        Book book = this.removeBook();
        borrower.addBook(book);

    }
}

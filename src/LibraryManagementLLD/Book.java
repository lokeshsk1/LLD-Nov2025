package LibraryManagementLLD;

public class Book {

    private long bookId;
    private String title;
    private String ISBN;
    private String author;


    public Book(long bookId, String title, String ISBN, String author) {
        this.bookId = bookId;
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

package LibraryManagementLLD;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book(1001, "Alchemist", "ABC123", "Paul");
        Book book2 = new Book(1002, "Ikigai", "XYZ456", "John");

        Member member1 = new Member(101, "Lokesh");
        Member member2 = new Member(102, "Rahul");

        LibraryManager libraryManager = new LibraryManager();

        libraryManager.addBook(book1);
        libraryManager.addBook(book2);

        libraryManager.borrowBook(member1, book1);
        libraryManager.borrowBook(member2, book1);
        libraryManager.borrowBook(member2, book2);

        libraryManager.returnBook(member1, book2);
        libraryManager.returnBook(member2, book2);

        libraryManager.removeBook(book2);
        libraryManager.removeBook(book2);

        libraryManager.borrowBook(member1, book2);


    }
}

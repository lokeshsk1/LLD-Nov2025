package LibraryManagementLLD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryManager {

    private final List<Book> availableBooks = new ArrayList<>();
    private final List<Book> borrowedBooks = new ArrayList<>();
    private final Map<Member, List<Book>> memberIdVsBorrowedBookIds = new HashMap<>();

    public void borrowBook(Member member, Book book){
        if(borrowedBooks.contains(book)){
            System.out.println("Book " + book.getTitle() + " already borrowed by a member");
        }
        else if(availableBooks.contains(book)){

            if(!memberIdVsBorrowedBookIds.containsKey(member)){
                memberIdVsBorrowedBookIds.put(member, new ArrayList<>());
            }
            memberIdVsBorrowedBookIds.get(member).add(book);

            borrowedBooks.add(book);
            availableBooks.remove(book);

            System.out.println(member.getMemberName() + " borrowed the book " + book.getTitle());
        }else{
            System.out.println(book.getTitle() + " book is unavailable");
        }
    }

    public void returnBook(Member member, Book book){

        if(memberIdVsBorrowedBookIds.containsKey(member) && memberIdVsBorrowedBookIds.get(member).contains(book)){
            memberIdVsBorrowedBookIds.get(member).remove(book);
            borrowedBooks.remove(book);
            availableBooks.add(book);
            System.out.println(member.getMemberName() + " returned the book " + book.getTitle());
        }else{
            System.out.println(member.getMemberName() + " didn't borrow the book " + book.getTitle() + " so can't return");
        }
    }


    public void addBook(Book book){
        availableBooks.add(book);
    }

    public void removeBook(Book book){
        if(availableBooks.contains(book)){
            availableBooks.remove(book);
            System.out.println(book.getTitle() + " Book removed");
        }else{
            System.out.println(book.getTitle() + " Book unavailable, so unable to remove");
        }
    }



}

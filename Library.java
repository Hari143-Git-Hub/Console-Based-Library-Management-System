package library;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void displayBooks(){
        for(Book b : books){
            System.out.println(b.getIsbn()+" | "+b.getTitle()+" | "+b.getAuthor()+" | "+b.isAvailable());
        }
    }

    public Book findBook(String isbn){
        for(Book b : books){
            if(b.getIsbn().equals(isbn))
                return b;
        }
        return null;
    }

    public void registerMember(Member member){
        members.add(member);
        System.out.println("Member registered.");
    }

    public void borrowBook(int memberId,String isbn){

        Book book = findBook(isbn);

        if(book == null || !book.isAvailable()){
            System.out.println("Book not available.");
            return;
        }

        for(Member m : members){
            if(m.getId() == memberId){
                m.borrowBook(isbn);
                book.setAvailable(false);
                System.out.println("Book borrowed.");
                return;
            }
        }
    }

    public void returnBook(int memberId,String isbn){

        for(Member m : members){
            if(m.getId() == memberId){
                m.returnBook(isbn);
                Book book = findBook(isbn);
                book.setAvailable(true);
                System.out.println("Book returned.");
            }
        }
    }

    public ArrayList<Book> getBooks(){
        return books;
    }

    public ArrayList<Member> getMembers(){
        return members;
    }
}
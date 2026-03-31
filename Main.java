package library;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Library library = new Library();

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("\nLibrary Menu");
            System.out.println("1 Add Book");
            System.out.println("2 Show Books");
            System.out.println("3 Register Member");
            System.out.println("4 Borrow Book");
            System.out.println("5 Return Book");
            System.out.println("6 Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:

                    System.out.print("ISBN: ");
                    String isbn = sc.nextLine();

                    System.out.print("Title: ");
                    String title = sc.nextLine();

                    System.out.print("Author: ");
                    String author = sc.nextLine();

                    library.addBook(new Book(isbn,title,author));

                    break;

                case 2:

                    library.displayBooks();
                    break;

                case 3:

                    System.out.print("Member ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    library.registerMember(new Member(id,name));

                    break;

                case 4:

                    System.out.print("Member ID: ");
                    int mid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Book ISBN: ");
                    String bisbn = sc.nextLine();

                    library.borrowBook(mid,bisbn);

                    break;

                case 5:

                    System.out.print("Member ID: ");
                    int rid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Book ISBN: ");
                    String risbn = sc.nextLine();

                    library.returnBook(rid,risbn);

                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}

package library;

public class Book {

    private String isbn;
    private String title;
    private String author;
    private boolean available;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getIsbn() { return isbn; }

    public String getTitle() { return title; }

    public String getAuthor() { return author; }

    public boolean isAvailable() { return available; }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String toFileString() {
        return isbn + "," + title + "," + author + "," + available;
    }

    public static Book fromFileString(String line) {
        String[] data = line.split(",");
        Book book = new Book(data[0], data[1], data[2]);
        book.setAvailable(Boolean.parseBoolean(data[3]));
        return book;
    }
}
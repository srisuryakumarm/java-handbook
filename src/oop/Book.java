package oop;

public class Book {

    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void checkOut() {
        if (!isAvailable) {
            System.out.println(title + " is already checked out.");
            return;
        }
        isAvailable = false;
        System.out.println(title + " checked out successfully.");
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println(title + " returned successfully.");
    }

    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", "Robert Martin");
        book1.checkOut();
        book1.checkOut();
        book1.returnBook();
        book1.checkOut();
    }
}
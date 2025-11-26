package class_object;

import java.util.ArrayList;

class Book {
    String title;
    String author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    void displayBook() {
        System.out.println(title + " by " + author);
    }
}
class Library {
    ArrayList<Book> books = new ArrayList<>();
    void addBook(Book b) {
        books.add(b);
    }
    void showLibraryBooks() {
        System.out.println("\nBooks in this Library:");
        for (Book b : books) {
            b.displayBook();
        }
    }
}
public class Libraries {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("The Village by the Sea", "Anita Desai");
        Book b3 = new Book("The Match", "Sarah Adams");
        Library lib1 = new Library();
        Library lib2 = new Library();
        lib1.addBook(b1);
        lib1.addBook(b2);
        lib2.addBook(b2);
        lib2.addBook(b3);
        System.out.println("Library 1:");
        lib1.showLibraryBooks();
        System.out.println("\nLibrary 2:");
        lib2.showLibraryBooks();
    }
}

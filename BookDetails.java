package class_object;

class BookDetails {
    String title;
    String author;
    double price;
    BookDetails(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs." + price);
    }
    public static void main(String[] args) {
        BookDetails b = new BookDetails("The Match", "Sarah Adams", 299);
        b.displayDetails();
    }
}

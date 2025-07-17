import java.util.Scanner;

public class nptel_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter book title: ");
        String title = sc.nextLine();

        System.out.println("Enter author name: ");
        String author = sc.nextLine();

        Book book = new Book();

        book.setTitle(title);
        book.setAuthor(author);

        book.displayDetails();
        sc.close();
        
    }
}
class Book {
    private String title;
    private String author;

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public void displayDetails () {
            System.out.println("Title: " + this.title);
            System.out.print("Author: " + this.author);
    }
}

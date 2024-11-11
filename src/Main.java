
import Package2.Book;
import Package2.Libo;
import Package2.Borrowing;



public class Main {
    public static void main(String[] args) {

        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 11);
        Libo libo = new Libo("John ", "Sam@example.com");
        Borrowing borrowing = new Borrowing(book, libo, "5-5-2024");



        System.out.println("Borrowing Details:");
        System.out.println("Book Title: " + borrowing.getBook().getTitle());
        System.out.println("Book Author: " + borrowing.getBook().getAuthor());
        System.out.println("Book Id " + borrowing.getBook().getBookId());

        System.out.println("Borrower Name: " + borrowing.getLibo().getName());
        System.out.println("Borrower Email: " + borrowing.getBook());
        System.out.println("Borrow Date: " + borrowing.getBorrowDate());






    }
}

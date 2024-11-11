
import Package2.Book;
import Package2.Libo;
import Package2.Borrowing;



public class Main {
    public static void main(String[] args) {

        Book book = new Book("Love and Thunder", "F. Scott Fitzgerald", 11);
        Libo libo = new Libo("Lam ", "Sam@example.com");
        Borrowing borrowing = new Borrowing(book, libo, "10-05-2023");



        System.out.println("Borrowing Details:");
        System.out.println("Book Title: " + borrowing.getBook().getTitle());
        System.out.println("Book Author: " + borrowing.getBook().getAuthor());
        System.out.println("Book Id " + borrowing.getBook().getBookId());

        System.out.println("Borrower Name: " + borrowing.getLibo().getName());
        System.out.println("Borrower Email: " + borrowing.getBook());
        System.out.println("Borrow Date: " + borrowing.getBorrowDate());






    }
}

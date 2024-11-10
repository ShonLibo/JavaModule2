package Package2;

public class Borrowing {
    Book book;
    Libo libo;
    String borrowDate;

    public Borrowing(Book book,Libo libo, String borrowDate){
 this.book =book;
 this.libo =libo;
 this.borrowDate =borrowDate;
    }

    public Book getBook() {
        return book;
    }

    public Libo getLibo() {
        return libo;
    }

    public String getBorrowDate() {
        return borrowDate;
    }
}

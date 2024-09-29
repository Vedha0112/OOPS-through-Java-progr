class Book {  
    String BookName;  
    String isbnNumber;  
    String AuthorName;  
    String Publisher;  

    public Book(String book, String isbn, String author, String publisher) {  
        this.BookName = book;  
        this.isbnNumber = isbn;  
        this.AuthorName = author ;  
        this.Publisher = publisher;  
    }  

    public String getBookInfo() {  
        return "Book Name: " + BookName + "\n" +  
               "ISBN: " + isbnNumber + "\n" +  
               "Author: " + AuthorName + "\n" +  
               "Publisher: " + Publisher;  
    }  
}  

public class Main {  
    public static void main(String[] args) {  
        Book book = new Book(" Java", "14765498", "Robert C. ", "McGraw");  
        System.out.println(book.getBookInfo());  

     
    }  
}

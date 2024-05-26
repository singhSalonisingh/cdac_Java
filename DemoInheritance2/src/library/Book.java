package library;

public class Book {
private String bookName;
private double bookPrice;
private int bookId;

public Book() {

}

public Book(String bookName,double bookPrice,int bookId) {
	this.bookName=bookName;
	this.bookPrice=bookPrice;
	this.bookId=bookId;
	
}

public String toString() {
	return "Book Name: "+bookName+" Book Price: "+bookPrice+" Book Id: "+bookId;
}
}

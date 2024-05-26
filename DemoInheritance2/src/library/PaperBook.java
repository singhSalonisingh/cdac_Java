package library;

public class PaperBook extends Book{
private int numberOfPages;
private Date dateOfPublication;

public PaperBook() {
	super();
	dateOfPublication=new Date();
}

public PaperBook(int numberOfPages,String bookName,double bookPrice,int bookId ,int day,int month,int year) {
	super(bookName,bookPrice,bookId);
	this.numberOfPages=numberOfPages;
	dateOfPublication=new Date(day,month,year);
}

public String toString() {
	return ""+super.toString()+"number of pages: "+numberOfPages+" Date of Publication: "+dateOfPublication.toString();
}

}

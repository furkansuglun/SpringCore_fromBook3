package _05.Get.Any.Method.in.SpringEL.with.XML;

public class Book {

	private long bookISBN;
	private String bookName;
	
	public long getBookISBN() {
		return bookISBN;
	}
	public void setBookISBN(long bookISBN) {
		this.bookISBN = bookISBN;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getBookInformation(String authorName , String authorSurname , String bookName , long bookISBN) {
		
		this.bookName = bookName;
		this.bookISBN = bookISBN;
		
		return "\n\tAuthor : " + authorName + " "  + authorSurname +
				"\n\tBook : " + bookName +
				"\n\tBookISBN : " + bookISBN;
	}
	
	
	
}

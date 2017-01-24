package _06.Get.Any.Method.in.SpringEL.with.Annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bookBean")
public class Book {
	
	@Value("1234556675845432")
	private long bookISBN;
	
	@Value("Spring Framework")
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

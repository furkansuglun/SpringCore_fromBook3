package _04.SpringExpressionLanguage.with.Annotation;

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
	
	
	
}

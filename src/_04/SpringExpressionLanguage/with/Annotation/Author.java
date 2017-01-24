package _04.SpringExpressionLanguage.with.Annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("authorBean")
public class Author {
	
	@Value("Mimar")
	private String name;
	@Value("Aslan")
	private String surname; 
	@Value("#{bookBean.bookName}")
	private String bookName;
	@Value("#{bookBean}")
	private Book book;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	
	
}

package _06.Get.Any.Method.in.SpringEL.with.Annotations;

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
	@Value("#{bookBean.getBookInformation('Furkan' , 'S��l�n', 'javaxlog.blogspot.com' ,'3214123412123')}")
	private String info;
	
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
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	
	
}

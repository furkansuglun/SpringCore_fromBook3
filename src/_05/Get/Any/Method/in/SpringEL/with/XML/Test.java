package _05.Get.Any.Method.in.SpringEL.with.XML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("05.spring.xml");

		Author author = applicationContext.getBean("authorBean" , Author.class);
		
		System.out.println("Author : " + author.getName() + " " + author.getSurname());
		System.out.println("Boook : " + author.getBookName());
		System.out.println("Book ISBN : " + author.getBook().getBookISBN());
		
		System.out.println(author.getInfo());
		
		((AbstractApplicationContext) applicationContext).close();
	}

}

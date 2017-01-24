package _06.Get.Any.Method.in.SpringEL.with.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//ConfigurableApplicationContext ile beanler uzeerýnde iþlemler yaomamýzý saðlar @value gibi
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("06.spring.xml");
		Author author = applicationContext.getBean("authorBean" , Author.class);
		
		System.out.println("Author : " + author.getName() + " " + author.getSurname());
		System.out.println("Boook : " + author.getBookName());
		System.out.println("Book ISBN : " + author.getBook().getBookISBN());
		
		System.out.println(author.getInfo());
		
		applicationContext.close();
	}

}

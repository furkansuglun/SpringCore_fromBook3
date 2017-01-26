package _12.Lists.Maps.in.SpringEL.with.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("12.spring.xml");
		
		Lists lists = applicationContext.getBean("listsBean" , Lists.class);
		
		System.out.println(lists);
		
		((AbstractApplicationContext) applicationContext).close();
	}

}

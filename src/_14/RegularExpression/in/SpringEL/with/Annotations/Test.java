package _14.RegularExpression.in.SpringEL.with.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("14.spring.xml");
		
		Lists lists = applicationContext.getBean("listsBean" , Lists.class);
		
		System.out.println(lists);
		
		RegExControl control = applicationContext.getBean("regExControlBean" , RegExControl.class);
		
		System.out.println(control);
		
		((AbstractApplicationContext) applicationContext).close();
	}

}

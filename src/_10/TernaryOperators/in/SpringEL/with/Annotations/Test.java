package _10.TernaryOperators.in.SpringEL.with.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("10.spring.xml");
		
		TernaryOperator operator = applicationContext.getBean("ternaryOperatorBean" , TernaryOperator.class);
		
		System.out.println(operator);
		
		System.out.println("result : " + operator.isControl());
		
		((AbstractApplicationContext) applicationContext).close();
	}
}

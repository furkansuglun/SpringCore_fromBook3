package _02.Component.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("02.spring.xml");
		
		Calculator calculator = applicationContext.getBean("calculatorBeanComponent",Calculator.class);
		
		calculator.showResult(5, 3);
		
		((AbstractApplicationContext) applicationContext).close();

	}

}

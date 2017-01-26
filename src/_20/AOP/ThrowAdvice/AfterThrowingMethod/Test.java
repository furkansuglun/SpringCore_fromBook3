package _20.AOP.ThrowAdvice.AfterThrowingMethod;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("20.spring.xml");
		
		EmployeeService employeeService = applicationContext.getBean("employeeServiceProxy",EmployeeService.class);
		
		try {
			employeeService.checkNameSurname();
			employeeService.sayHi("Hi!");
			employeeService.getEmployeeInfo();
		} catch (Exception e) {
			System.out.println("exception in EmployeeService#checkNameSurname()");
			e.printStackTrace();
		}
		
		
		
		applicationContext.close();
	}

}

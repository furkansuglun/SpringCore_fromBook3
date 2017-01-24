package _02.Component.Annotation;

import org.springframework.stereotype.Component;

@Component("operationBeanComponent")
public class Operation {

	public int addition(int number1 , int number2) {
		return number1+number2;
	}
	
	public int extraction(int number1 , int number2) {
		return number1-number2;
	}
	
	public int division(int number1 , int number2) {
		return number1/number2;
	}
	
	public int multiplication(int number1 , int number2) {
		return number1*number2;
	}
	
}

package _02.Component.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component ile otomotaik olarak bean tanýmý yapýlýyor.

@Component("calculatorBeanComponent")
public class Calculator {

	@Autowired
	private Operation operation;

	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}
	
	public void showResult(int number1 , int number2) {
		System.out.println("addition : " + operation.addition(number1, number2));
		System.out.println("extraction : " + operation.extraction(number1, number2));
		System.out.println("division : " + operation.division(number1, number2));
		System.out.println("multiplication : " + operation.multiplication(number1, number2));
	}
	
	
}

package _08.Operators.in.SpringEL.with.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("08.spring.xml");
		
		Operators operators = applicationContext.getBean("operatorsBean",Operators.class);
		
		System.out.println("equalTest : " + operators.isEqualTest() + "\n" +
				"notEqualTest : " + operators.isNotEqualTest() + "\n" +
				"lessThanTest : " + operators.isLessThanTest() + "\n" +
				"lessThanOrEqualTest : " + operators.isLessThanOrEqualTest() + "\n" +
				"greaterThanTest : " + operators.isGreaterThanTest() + "\n" +
				"greaterThanOrEqualTest : " + operators.isGreaterThanOrEqualTest() + "\n" +
				"andTest  : " + operators.isAndTest() + "\n" +
				"notTest : " + operators.isNotTest() + "\n" +
				"orTest : " + operators.isOrTest() + "\n" +
				"addTest : " + operators.getAddTest() + "\n" +
				"addStringTest : " + operators.getAddStringTest()+ "\n" +
				"subtractionTest : " + operators.getSubtractionTest() + "\n" +
				"multiplicationTest : " + operators.getMultiplicationTest() + "\n" +
				"divisionTest : " + operators.getDivisionTest() + "\n" +
				"modulusTest : " + operators.getModulusTest() + "\n" +
				"exponentialPowerTest: " + operators.getExponentialPowerTest() );
		
		((AbstractApplicationContext) applicationContext).close();
		
	}

}

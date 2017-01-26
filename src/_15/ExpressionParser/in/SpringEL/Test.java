package _15.ExpressionParser.in.SpringEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Test {

	public static void main(String[] args) {
		
		ExpressionParser expressionParser = new SpelExpressionParser();
		//-------------------------------------
		Expression expression1 = expressionParser.parseExpression("'Furkan Süðlün'");
		String message1 = expression1.getValue(String.class);
		System.out.println(message1);
		//-------------------------------------
		Expression expression2 = expressionParser.parseExpression("'Furkan Süðlün'.length()");
		int message2 = (Integer) expression2.getValue();
		System.out.println("length is : " + message2);
		//-------------------------------------
		Expression expression3 = expressionParser.parseExpression("2*3");
		int message3= (Integer) expression3.getValue();
		System.out.println("multiplication  : " + message3);
		
		//-------------------------------------
		Source source = new Source();
		StandardEvaluationContext evaluationContext = new StandardEvaluationContext(source);
		
		Expression expression4 = expressionParser.parseExpression("email");
		String message4=  expression4.getValue(evaluationContext , String.class);
		System.out.println("email is : " + message4);
		//-------------------------------------
		Expression expression5;
		String message5;
		expression5 = expressionParser.parseExpression("email == 'furkan.suglun@gmail.com'");
		boolean bool5 = expression5.getValue(evaluationContext , Boolean.class);
		if(bool5 == true) {
			message5 = "Email verified.";
		} else {
			message5 = "Email didnt verify";
		}
		System.out.println(message5);
		
	}

}

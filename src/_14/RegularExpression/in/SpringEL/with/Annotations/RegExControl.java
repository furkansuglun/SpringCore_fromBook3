package _14.RegularExpression.in.SpringEL.with.Annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("regExControlBean")
public class RegExControl {

	@Value("^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,3})$")
	private String regEx;
	@Value("#{(sourceBean.map['Furkan Süðlün'] matches regExControlBean.regEx) == true ? 'APPROPRIATE' : 'INAPPROPRIATE'}")
	private String regExResult;
	
	public String getRegEx() {
		return regEx;
	}
	public void setRegEx(String regEx) {
		this.regEx = regEx;
	}
	public String getRegExResult() {
		return regExResult;
	}
	public void setRegExResult(String regExResult) {
		this.regExResult = regExResult;
	}
	@Override
	public String toString() {
		return "E-mail address you entered is : " + regExResult;
	}
	
	
	
	
}

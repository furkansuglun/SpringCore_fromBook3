package _13.RegularExpression.in.SpringEL.with.XML;

public class RegExControl {

	private String regEx;
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

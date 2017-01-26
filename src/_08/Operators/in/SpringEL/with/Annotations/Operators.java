package _08.Operators.in.SpringEL.with.Annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("operatorsBean")
public class Operators {

	@Value("#{numbersBean.n1 == 12}")
	private boolean equalTest;
	@Value("#{numbersBean.n2 != numbersBean.n2}")
	private boolean notEqualTest;
	@Value("#{numbersBean.n3 lt numbersBean.n1}")
	private boolean lessThanTest;
	@Value("#{numbersBean.n4 le numbersBean.n2}")
	private boolean lessThanOrEqualTest;
	@Value("#{numbersBean.n5 > numbersBean.n5}")
	private boolean greaterThanTest;
	@Value("#{numbersBean.n1 >= numbersBean.n3}")
	private boolean greaterThanOrEqualTest;
	
	@Value("#{numbersBean.n2 == 17 and  numbersBean.n2 lt 17}")
	private boolean andTest;
	@Value("#{!(numbersBean.n4 == 123)}")
	private boolean notTest;
	@Value("#{numbersBean.n3 == 45 or numbersBean.n4 lt 123}")
	private boolean orTest;
	
	@Value("#{numbersBean.n5 + numbersBean.n2}")
	private double addTest;
	@Value("#{'Hello' + '.! ' + 'SpringEl'}")
	private String addStringTest;
	@Value("#{numbersBean.n1 - numbersBean.n3 }")
	private double subtractionTest;
	@Value("#{numbersBean.n2 * numbersBean.n4 }")
	private double multiplicationTest;
	@Value("#{numbersBean.n2 / numbersBean.n2 }")
	private double divisionTest;
	@Value("#{numbersBean.n4 % numbersBean.n1 }")
	private double modulusTest;
	
	@Value("#{numbersBean.n5 ^ 2 }")
	private double exponentialPowerTest;
	
	public boolean isEqualTest() {
		return equalTest;
	}
	public void setEqualTest(boolean equalTest) {
		this.equalTest = equalTest;
	}
	public boolean isNotEqualTest() {
		return notEqualTest;
	}
	public void setNotEqualTest(boolean notEqualTest) {
		this.notEqualTest = notEqualTest;
	}
	public boolean isLessThanTest() {
		return lessThanTest;
	}
	public void setLessThanTest(boolean lessThanTest) {
		this.lessThanTest = lessThanTest;
	}
	public boolean isLessThanOrEqualTest() {
		return lessThanOrEqualTest;
	}
	public void setLessThanOrEqualTest(boolean lessThanOrEqualTest) {
		this.lessThanOrEqualTest = lessThanOrEqualTest;
	}
	public boolean isGreaterThanTest() {
		return greaterThanTest;
	}
	public void setGreaterThanTest(boolean greaterThanTest) {
		this.greaterThanTest = greaterThanTest;
	}
	public boolean isGreaterThanOrEqualTest() {
		return greaterThanOrEqualTest;
	}
	public void setGreaterThanOrEqualTest(boolean greaterThanOrEqualTest) {
		this.greaterThanOrEqualTest = greaterThanOrEqualTest;
	}
	public boolean isAndTest() {
		return andTest;
	}
	public void setAndTest(boolean andTest) {
		this.andTest = andTest;
	}
	public boolean isNotTest() {
		return notTest;
	}
	public void setNotTest(boolean notTest) {
		this.notTest = notTest;
	}
	public boolean isOrTest() {
		return orTest;
	}
	public void setOrTest(boolean orTest) {
		this.orTest = orTest;
	}
	public double getAddTest() {
		return addTest;
	}
	public void setAddTest(double addTest) {
		this.addTest = addTest;
	}
	public String getAddStringTest() {
		return addStringTest;
	}
	public void setAddStringTest(String addStringTest) {
		this.addStringTest = addStringTest;
	}
	public double getSubtractionTest() {
		return subtractionTest;
	}
	public void setSubtractionTest(double subtractionTest) {
		this.subtractionTest = subtractionTest;
	}
	public double getMultiplicationTest() {
		return multiplicationTest;
	}
	public void setMultiplicationTest(double multiplicationTest) {
		this.multiplicationTest = multiplicationTest;
	}
	public double getDivisionTest() {
		return divisionTest;
	}
	public void setDivisionTest(double divisionTest) {
		this.divisionTest = divisionTest;
	}
	public double getModulusTest() {
		return modulusTest;
	}
	public void setModulusTest(double modulusTest) {
		this.modulusTest = modulusTest;
	}
	public double getExponentialPowerTest() {
		return exponentialPowerTest;
	}
	public void setExponentialPowerTest(double exponentialPowerTest) {
		this.exponentialPowerTest = exponentialPowerTest;
	}

	
	
}

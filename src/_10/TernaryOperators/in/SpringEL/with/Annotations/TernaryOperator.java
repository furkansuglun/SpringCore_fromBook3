package _10.TernaryOperators.in.SpringEL.with.Annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ternaryOperatorBean")
public class TernaryOperator {

	@Value("#{numbersBean.n1 lt numbersBean.n3 ? true : false}")
	private boolean control;

	public boolean isControl() {
		return control;
	}

	public void setControl(boolean control) {
		this.control = control;
	}

	@Override
	public String toString() {
		return "TernaryOperator control =  " + control;
	}
	
	
	
}

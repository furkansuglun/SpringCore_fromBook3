package _17.Custom.Events.Handling;

import org.springframework.context.ApplicationEvent;
//uygulama çalýþtýgýnda olay oluþturmak için ApplicationEvent sýnýfýný extends ederiz
public class CustomEvent extends ApplicationEvent {
	
	//serialVersionUID ile JVM sýnýfýmýzý daha hýzlý Serialize eder.
	//sserialization yapýlacak her yerde serialVersionUID kullanýlmalýdýr.
	private static final long serialVersionUID = 1L;
	
	public CustomEvent(Object source) {
		super(source);
	}
	
	public String toString() {
		return "Custom Event";
	}

}

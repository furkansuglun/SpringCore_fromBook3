package _17.Custom.Events.Handling;

import org.springframework.context.ApplicationEvent;
//uygulama �al��t�g�nda olay olu�turmak i�in ApplicationEvent s�n�f�n� extends ederiz
public class CustomEvent extends ApplicationEvent {
	
	//serialVersionUID ile JVM s�n�f�m�z� daha h�zl� Serialize eder.
	//sserialization yap�lacak her yerde serialVersionUID kullan�lmal�d�r.
	private static final long serialVersionUID = 1L;
	
	public CustomEvent(Object source) {
		super(source);
	}
	
	public String toString() {
		return "Custom Event";
	}

}

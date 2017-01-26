package _17.Custom.Events.Handling;

import org.springframework.context.ApplicationListener;
//uygulamayý dinleyen arayüz ApplicationListener dahil edildi.
public class CustomEventHandler implements ApplicationListener<CustomEvent> {

	@Override
	public void onApplicationEvent(CustomEvent event) {
		System.out.println(event.toString());
	}

}

package _17.Custom.Events.Handling;

import org.springframework.context.ApplicationListener;
//uygulamay� dinleyen aray�z ApplicationListener dahil edildi.
public class CustomEventHandler implements ApplicationListener<CustomEvent> {

	@Override
	public void onApplicationEvent(CustomEvent event) {
		System.out.println(event.toString());
	}

}

package _17.Custom.Events.Handling;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
//custom event in kullanýlabilir olmasý için ApplicationEventPublisherAware implementi gereklidir.
public class CustomEventPublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
	
	public void publish() {
		CustomEvent customEvent = new CustomEvent(this); 
		publisher.publishEvent(customEvent);
	}

}

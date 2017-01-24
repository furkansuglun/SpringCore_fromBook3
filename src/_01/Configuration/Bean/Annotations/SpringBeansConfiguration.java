package _01.Configuration.Bean.Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//sýnýfýn spring ayra dosyasý oldugunu belirtiyoruz.@configuration ile

@Configuration
public class SpringBeansConfiguration {

	//@Bean ilebean tanýmý yapýyoruz.
	
	@Bean
	public City getCity() {
		City city = new City();
		city.setCityName("Sakarya/Akyazý");
		city.setPlateNumber(54);
		return city;
		
	}
	
	@Bean
	public Student getStudent() {
		Student student = new Student();
		student.setName("Furkan");
		student.setSurname("Süðlün");
		student.setCity(getCity());
		return student;
	}
	
}

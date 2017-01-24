package _01.Configuration.Bean.Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//s�n�f�n spring ayra dosyas� oldugunu belirtiyoruz.@configuration ile

@Configuration
public class SpringBeansConfiguration {

	//@Bean ilebean tan�m� yap�yoruz.
	
	@Bean
	public City getCity() {
		City city = new City();
		city.setCityName("Sakarya/Akyaz�");
		city.setPlateNumber(54);
		return city;
		
	}
	
	@Bean
	public Student getStudent() {
		Student student = new Student();
		student.setName("Furkan");
		student.setSurname("S��l�n");
		student.setCity(getCity());
		return student;
	}
	
}

package _01.Configuration.Bean.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//eðer spring bean tanýmý java sýnýfý ile olursa AnnotationConfigApplicationContext kullanýyoruz
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		
		//hangi configuration sýnýfýnýn kullanýlacaðýný belirtiyoruz 
		applicationContext.register(SpringBeansConfiguration.class);
		//container refreh edilmesi performansa olumlu katký saðlar
		applicationContext.refresh();
		
		Student student = applicationContext.getBean(Student.class);
		System.out.println("name:" + student.getName());
		System.out.println("surname: " + student.getSurname());
		System.out.println("city " + student.getCity().getCityName().toString() );
		System.out.println("plateNumber " + student.getCity().getPlateNumber());
	}
	
}

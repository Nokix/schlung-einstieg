package gmbh.conteco.schlungeinstieg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
@ComponentScan
@Configuration
public class SchlungEinstiegApplication {

	public static void main(String[] args) {
		ApplicationContext context
				= new AnnotationConfigApplicationContext(SchlungEinstiegApplication.class);
		Doctor doctor = (Doctor) context.getBean("doctor");
		System.out.println(doctor.assist());

//		SpringApplication.run(SchlungEinstiegApplication.class, args);
	}

}

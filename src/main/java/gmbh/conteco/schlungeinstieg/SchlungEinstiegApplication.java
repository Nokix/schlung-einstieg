package gmbh.conteco.schlungeinstieg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@ComponentScan("gmbh.conteco")
public class SchlungEinstiegApplication {

	public static void main(String[] args) {
		ApplicationContext context =
				SpringApplication.run(SchlungEinstiegApplication.class, args);
		Doctor doctor = context.getBean(Doctor.class);
		System.out.println(doctor.assist());
	}

	@Bean
	@Profile("dev")
	public String qualification() {
		return "Mr. Arzt";
	}

	@Bean
	public String getName() {
		return "Gustav";
	}

//	@Bean("doctor")
//	public Doctor getDoctor(String qualification, Nurse nurse) {
//		return new Doctor(qualification, nurse);
//	}
}

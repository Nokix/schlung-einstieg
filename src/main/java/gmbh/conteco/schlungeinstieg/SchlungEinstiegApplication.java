package gmbh.conteco.schlungeinstieg;

import gmbh.conteco.schlungeinstieg.hospital.Doctor;
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

	}
}

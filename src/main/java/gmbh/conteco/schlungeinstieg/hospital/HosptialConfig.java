package gmbh.conteco.schlungeinstieg.hospital;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HosptialConfig {
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

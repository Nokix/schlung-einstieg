package gmbh.conteco.schlungeinstieg.rest;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestConfig {
    @Bean
    public Faker faker() {
        return new Faker();
    }
}

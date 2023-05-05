package gmbh.conteco.schlungeinstieg.rest;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class RestConfig {
    @Bean
    public Faker faker() {
        return new Faker();
    }

    @Bean
    @Profile("mvc")
    public CommandLineRunner runner() {
        return args -> {
            System.out.println("Hallo MVC");
        };
    }
}

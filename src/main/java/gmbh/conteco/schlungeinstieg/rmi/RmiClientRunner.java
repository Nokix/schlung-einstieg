package gmbh.conteco.schlungeinstieg.rmi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("rmi")
public class RmiClientRunner implements CommandLineRunner {

    @Autowired
    Calculator calculator;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hallo RMI");
        System.out.println(calculator.add(1, 2));
    }
}

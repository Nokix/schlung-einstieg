package gmbh.conteco.schlungeinstieg;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Nurse implements Staff{
    @Override
    public String assist() {
        return "Nurse is helping.";
    }
}

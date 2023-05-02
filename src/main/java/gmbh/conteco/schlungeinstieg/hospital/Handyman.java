package gmbh.conteco.schlungeinstieg.hospital;

import org.springframework.stereotype.Component;

@Component
public class Handyman implements Staff{
    @Override
    public String assist() {
        return "Handyman is helping.";
    }
}

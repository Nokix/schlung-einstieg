package gmbh.conteco.schlungeinstieg.hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Doctor implements Staff {
    @Value("Karl")
    String qualification;

    @Autowired
    //@Qualifier("handyman")
    Staff staff;

    @Override
    public String assist() {
        return qualification + " is helping." + " " + this.staff.assist();
    }
}

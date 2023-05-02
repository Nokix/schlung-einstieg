package gmbh.conteco.schlungeinstieg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Doctor {
    String qualification;
    Nurse nurse;

    public Doctor(@Value("Dr.") String qualification, Nurse nurse) {
        this.qualification = qualification;
        this.nurse = nurse;
    }

    public String assist() {
        return qualification + " is helping." + " " + this.nurse.assist();
    }
}

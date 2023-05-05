package gmbh.conteco.schlungeinstieg.rest.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Entity
@Table(name = "benutzer")
public class User {
    @Id
    @GeneratedValue
    Long id;

    @NotBlank(message = "There must be a user name!")
    @Column(name = "BenutzerName")
    String name;
}

package gmbh.conteco.schlungeinstieg.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@ToString
@Getter
public class User {
    Long id;

    @NotBlank(message = "There must be a user name!")
    String name;
}

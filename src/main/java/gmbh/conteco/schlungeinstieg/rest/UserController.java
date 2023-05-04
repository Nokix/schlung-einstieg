package gmbh.conteco.schlungeinstieg.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    final private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUser() {
        return userService.getAllUsers();
    }
}

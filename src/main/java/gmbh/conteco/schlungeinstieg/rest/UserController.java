package gmbh.conteco.schlungeinstieg.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class UserController {

    final private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUser() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/users/id")
    public Optional<User> getUserById2(@RequestParam Long abc) {
        return userService.getUserById(abc);
    }

    @PostMapping("/user/generate")
    public List<User> generateUsers(
            @RequestParam(name = "n", defaultValue = "10") Long amount
    ) {
        return userService.generateUsers(amount);
    }

    @PostMapping("/users")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

}

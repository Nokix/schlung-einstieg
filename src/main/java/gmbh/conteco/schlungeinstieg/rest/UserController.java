package gmbh.conteco.schlungeinstieg.rest;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    final private UserService userService;

    @GetMapping("/users")
    @ResponseStatus(HttpStatus.OK)
    public List<User> getAllUser() {
        LOGGER.info("Somebody wants all the users!");
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/users/id")
    @ResponseStatus(HttpStatus.OK)
    public Optional<User> getUserById2(@RequestParam Long abc) {
        if (abc.equals(100L)) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "verboten!");
        }
        return userService.getUserById(abc);
    }

    @PostMapping("/user/generate")
    @ResponseStatus(HttpStatus.CREATED)
    public List<User> generateUsers(
            @RequestParam(name = "n", defaultValue = "10") Long amount
    ) {
        return userService.generateUsers(amount);
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public User saveUser(@RequestBody @Valid User user) {
        return userService.saveUser(user);
    }
}

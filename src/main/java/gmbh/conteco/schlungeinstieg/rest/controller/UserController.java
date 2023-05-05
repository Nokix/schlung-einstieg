package gmbh.conteco.schlungeinstieg.rest.controller;

import gmbh.conteco.schlungeinstieg.rest.entities.User;
import gmbh.conteco.schlungeinstieg.rest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@ManagedResource(objectName = "MyMBean:category=Controller,objectName=UserController")
public class UserController {
    private final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    final private UserService userService;

    @GetMapping("/users/count")
    @ManagedOperation
    public int countUsers() {
        return this.getAllUser().size();
    }

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

    @GetMapping("/users/name")
    public Collection<User> getUserByName(@RequestParam String name) {
        return userService.getUserByName(name);
    }
}

package gmbh.conteco.schlungeinstieg.rest.service;

import gmbh.conteco.schlungeinstieg.rest.entities.User;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();

    Optional<User> getUserById(Long id);

    List<User> generateUsers(Long amount);

    User saveUser(User user);

    Collection<User> getUserByName(String name);
}

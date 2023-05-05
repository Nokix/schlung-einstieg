package gmbh.conteco.schlungeinstieg.rest.repository;

import gmbh.conteco.schlungeinstieg.rest.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<User> getAllUsers();

    Optional<User> getUserById(Long id);

    User saveUser(User user);
}

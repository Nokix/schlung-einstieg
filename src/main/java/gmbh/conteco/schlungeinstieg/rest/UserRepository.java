package gmbh.conteco.schlungeinstieg.rest;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<User> getAllUsers();

    Optional<User> getUserById(Long id);

    User saveUser(User user);
}

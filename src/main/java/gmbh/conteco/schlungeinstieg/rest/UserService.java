package gmbh.conteco.schlungeinstieg.rest;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();

    Optional<User> getUserById(Long id);

    List<User> generateUsers(Long amount);

    User saveUser(User user);
}

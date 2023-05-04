package gmbh.conteco.schlungeinstieg.rest;

import java.util.List;

public interface UserRepository {
    List<User> getAllUsers();

    User getUserById(Long id);
}

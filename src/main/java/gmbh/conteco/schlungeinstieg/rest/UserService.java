package gmbh.conteco.schlungeinstieg.rest;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);
}

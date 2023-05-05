package gmbh.conteco.schlungeinstieg.rest.repository;

import gmbh.conteco.schlungeinstieg.rest.entities.User;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
@Profile("list_repo")
public class UserRepositoryImpl implements UserRepository {

    public List<User> users;

    public UserRepositoryImpl() {
        this.users = new ArrayList<>();
        this.users.add(new User(0L, "Florian"));
        this.users.add(new User(1L, "Alexander"));
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(this.users);
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    @Override
    public User saveUser(User user) {
        users.add(user);
        return user;
    }
}

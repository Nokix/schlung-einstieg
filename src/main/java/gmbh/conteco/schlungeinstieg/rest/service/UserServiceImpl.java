package gmbh.conteco.schlungeinstieg.rest.service;

import com.github.javafaker.Faker;
import gmbh.conteco.schlungeinstieg.rest.repository.UserRepositoryH2;
import gmbh.conteco.schlungeinstieg.rest.entities.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final UserRepositoryH2 userRepository;
    // Faker als bean zur Verfügung stellen.
    final Faker faker;

    @Override
    public List<User> getAllUsers() {
        System.out.println("Alle Users werden geladen.");
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.getUserById(id);
    }

    @Override
    public List<User> generateUsers(Long amount) {
        return LongStream.range(0, amount)
                .mapToObj(i -> new User(i, faker.name().firstName()))
                .map(userRepository::save)
                .collect(Collectors.toList());
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Collection<User> getUserByName(String name) {
        return userRepository.findByNameStartsWithIgnoreCase(name);
    }
}

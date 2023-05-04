package gmbh.conteco.schlungeinstieg.rest;

import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final UserRepository userRepository;
    // Faker als bean zur Verfügung stellen.
    final Faker faker;

    @Override
    public List<User> getAllUsers() {
        System.out.println("Alle Users werden geladen.");
        return userRepository.getAllUsers();
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.getUserById(id);
    }

    @Override
    public List<User> generateUsers(Long amount) {
        return LongStream.range(0, amount)
                .mapToObj(i -> new User(i, faker.name().firstName()))
                .map(userRepository::saveUser)
                .collect(Collectors.toList());
    }

    @Override
    public User saveUser(User user) {
        return userRepository.saveUser(user);
    }
}

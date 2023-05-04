package gmbh.conteco.schlungeinstieg.rest;

import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

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
        // Beispiel zur Erstellung eines Namens
        String firstName = faker.name().firstName();
        // amount viele user generieren
        // user im repository speichern
        // neue user zurückgeben.
        return null;
    }


}

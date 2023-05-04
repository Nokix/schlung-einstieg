package gmbh.conteco.schlungeinstieg.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        System.out.println("Alle Users werden geladen.");
        return userRepository.getAllUsers();
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.getUserById(id);
    }


}

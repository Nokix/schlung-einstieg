package gmbh.conteco.schlungeinstieg.rest.repository;

import gmbh.conteco.schlungeinstieg.rest.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;


public interface UserRepositoryH2 extends JpaRepository<User, Long> {
    @Query("select u from User u where upper(u.name) like upper(concat(?1, '%'))")
    List<User> findByNameStartsWithIgnoreCase(String name);

    Optional<User> getUserById(Long id);
}

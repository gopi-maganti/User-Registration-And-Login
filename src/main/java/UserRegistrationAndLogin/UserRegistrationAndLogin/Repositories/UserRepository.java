package UserRegistrationAndLogin.UserRegistrationAndLogin.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import UserRegistrationAndLogin.UserRegistrationAndLogin.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    Optional<User> findByUsername(String username);
}

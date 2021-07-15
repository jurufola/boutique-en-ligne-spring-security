package home.jurufola.boutiqueenlignespringsecurity.repositories;

import home.jurufola.boutiqueenlignespringsecurity.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByUsername(String username);
}

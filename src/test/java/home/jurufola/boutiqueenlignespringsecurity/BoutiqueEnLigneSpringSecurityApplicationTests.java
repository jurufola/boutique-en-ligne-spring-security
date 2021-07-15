package home.jurufola.boutiqueenlignespringsecurity;

import home.jurufola.boutiqueenlignespringsecurity.entities.User;
import home.jurufola.boutiqueenlignespringsecurity.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class BoutiqueEnLigneSpringSecurityApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Test
	void encodePassword() {

		User u = userRepository.findById(1L).get();
		String password = new BCryptPasswordEncoder().encode("beanpassword");
		u.setPassword(password);
		userRepository.save(u);
	}
	/*
	@Test
	void contextLoads() {
	}*/

}

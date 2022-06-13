package ivandjoh.jwt;

import ivandjoh.jwt.domain.AppRole;
import ivandjoh.jwt.domain.AppUser;
import ivandjoh.jwt.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.management.relation.Role;
import java.util.ArrayList;

@SpringBootApplication
public class SpringSecurityJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
			userService.saveRole(new AppRole(null,"ROLE_USER"));
			userService.saveRole(new AppRole(null,"ROLE_MANAGER"));
			userService.saveRole(new AppRole(null,"ROLE_ADMIN"));
			userService.saveRole(new AppRole(null,"ROLE_SUPER_ADMIN"));

			userService.saveUser(new AppUser(null,"ivandjoh","ivandjoh","ivand123",new ArrayList<>()));
			userService.saveUser(new AppUser(null,"juna","juna","juna123",new ArrayList<>()));

			userService.addRoleToUser("ivandjoh","ROLE_SUPER_ADMIN");
			userService.addRoleToUser("juna","ROLE_USER");
		};
	}
}

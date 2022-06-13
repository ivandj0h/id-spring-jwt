package ivandjoh.jwt.repository;

import ivandjoh.jwt.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * AppUserRepository
 * @author Ivan Djoh
 * @version 1.0.0
 * @since june 13, 2022
 */

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}

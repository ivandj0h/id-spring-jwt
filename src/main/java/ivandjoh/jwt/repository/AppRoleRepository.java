package ivandjoh.jwt.repository;

import ivandjoh.jwt.domain.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * AppRoleRepository
 * @author Ivan Djoh
 * @version 1.0.0
 * @since june 13, 2022
 */

public interface AppRoleRepository extends JpaRepository<AppRole, Long> {
    AppRole findByName(String name);
}

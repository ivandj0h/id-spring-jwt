package ivandjoh.jwt.service;

import ivandjoh.jwt.domain.AppRole;
import ivandjoh.jwt.domain.AppUser;

import java.util.List;

/**
 * UserService
 * @author Ivan Djoh
 * @version 1.0.0
 * @since june 13, 2022
 */

public interface UserService {
    AppUser saveUser(AppUser user);
    AppRole saveRole(AppRole role);
    void addRoleToUser(String username, String role);
    AppUser getUser(String username);
    List<AppUser> getAllUsers();
}

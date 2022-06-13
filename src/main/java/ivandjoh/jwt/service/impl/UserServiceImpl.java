package ivandjoh.jwt.service.impl;

import ivandjoh.jwt.domain.AppRole;
import ivandjoh.jwt.domain.AppUser;
import ivandjoh.jwt.repository.AppRoleRepository;
import ivandjoh.jwt.repository.AppUserRepository;
import ivandjoh.jwt.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImpl implements UserService {

    private final AppUserRepository appUserRepository;
    private final AppRoleRepository appRoleRepository;


    @Override
    public AppUser saveUser(AppUser user) {
        log.info("Saving user: {} into Database!", user.getName());
        return appUserRepository.save(user);
    }

    @Override
    public AppRole saveRole(AppRole role) {
        log.info("Saving role: {} into Database!", role.getName());
        return appRoleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        log.info("Adding role: {} to user: {}", roleName, username);
        AppUser user = appUserRepository.findByUsername(username);
        AppRole role = appRoleRepository.findByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public AppUser getUser(String username) {
        log.info("Fetching user: {} from Database!", username);
        return appUserRepository.findByUsername(username);
    }

    @Override
    public List<AppUser> getAllUsers() {
        log.info("Fetching all users from Database!");
        return appUserRepository.findAll();
    }
}

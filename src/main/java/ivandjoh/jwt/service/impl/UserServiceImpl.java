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
        return null;
    }

    @Override
    public AppRole saveRole(AppRole role) {
        return null;
    }

    @Override
    public void addRoleToUser(String username, String role) {

    }

    @Override
    public AppUser getUser(String username) {
        return null;
    }

    @Override
    public List<AppUser> getAllUsers() {
        return null;
    }
}

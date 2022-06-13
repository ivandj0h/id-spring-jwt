package ivandjoh.jwt.api;

import ivandjoh.jwt.domain.AppUser;
import ivandjoh.jwt.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * UserResourceController.
 * @author Ivan Djoh
 * @version 1.0.0
 * @since june 13, 2022
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class UserResourceController {

    private final UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<AppUser>> getAllUsers() {
        return ResponseEntity.ok().body(userService.getAllUsers());
    }
}

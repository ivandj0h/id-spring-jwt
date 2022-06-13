package ivandjoh.jwt.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * AppUser domain class.
 * @author Ivan Djoh
 * @version 1.0.0
 * @since june 13, 2022
 */

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class AppUser {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String username;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<AppRole> roles = new ArrayList<>();
}

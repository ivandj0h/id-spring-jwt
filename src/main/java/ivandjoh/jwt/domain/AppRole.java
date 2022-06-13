package ivandjoh.jwt.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * AppRole domain class.
 * @author Ivan Djoh
 * @version 1.0.0
 * @since june 13, 2022
 */

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class AppRole {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
}

package com.optimagrowth.user.model;

import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Data
@Entity
@Table(name="users")
public class User extends RepresentationModel<User> {
    @Id
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "first_name", nullable = false)
//    @Pattern(regexp = "^[a-zA-Z0-9]{6,12}$",
//            message = "username must be of 6 to 12 length with no special characters")
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "role_id", nullable = false)
    private String roleId;
    @Column(name = "dob")
    private String dob;
    @Column(name = "phone")
    @Pattern(regexp="(^$|[0-9]{10})")
    private String phone;
    @Column(name = "email")
    @Pattern(regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$",
            message = "Email should be in correct format")
    private String email;

    public User() {
    }
}
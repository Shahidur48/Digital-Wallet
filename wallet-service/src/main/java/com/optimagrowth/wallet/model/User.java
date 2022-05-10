package com.optimagrowth.wallet.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@ToString
public class User extends RepresentationModel<User> {
    private Long userId;
    private String firstName;
    private String lastName;
    private String roleId;
    private String dob;
    private String phone;
    private String email;
}
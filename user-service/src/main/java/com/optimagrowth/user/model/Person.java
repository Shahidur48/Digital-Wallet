package com.optimagrowth.user.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Data
@Entity
public class Person implements Serializable{
    @Id
    @GeneratedValue
    @Column(name = "personId", nullable = false)
    private Long personId;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy")
    @Column(name = "DOB")
    private Date DOB;

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "university")
    private String university;

}
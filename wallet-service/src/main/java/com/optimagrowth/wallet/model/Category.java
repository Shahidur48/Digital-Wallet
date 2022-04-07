package com.optimagrowth.product.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name="categories")
public class Category implements Serializable{
    @Id
    @Column(name = "cat_id", nullable = false)
    private Long catId;

    @Column(name = "cat_name")
    private String catName;

    @Column(name = "cat_desc")
    private String catDesc;

}
package com.optimagrowth.user.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name="products")
public class Product implements Serializable{
    @Id
    @GeneratedValue
    @Column(name = "product_id", nullable = false)
    private Long productId;

    @Column(name = "product_name")
    private Date productName;

    @Column(name = "product_desc")
    private String productDesc;

    @Column(name = "product_cat")
    private String productCategory;

    @Column(name = "product_status")
    private String productStatus;

}
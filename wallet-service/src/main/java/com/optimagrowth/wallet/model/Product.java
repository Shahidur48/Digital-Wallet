package com.optimagrowth.product.model;

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
    @Column(name = "product_id", nullable = false)
    private Long productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_desc")
    private String productDesc;

    @Column(name = "cat_id")
    private Long catId;

    @Column(name = "product_status")
    private String productStatus;

}
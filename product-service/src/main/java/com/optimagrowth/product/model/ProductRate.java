package com.optimagrowth.product.model;

import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Data
@Entity
@Table(name="product_rate")
public class ProductRate extends RepresentationModel<ProductRate> {
    @Id
    @Column(name = "product_id", nullable = false)
    private Long productId;

    @Column(name = "min_value", nullable = false)
    private String minValue;
    @Column(name = "max_value", nullable = false)
    private String maxValue;
    @Column(name = "role_id", nullable = false)
    private String roleId;
    @Column(name = "state_tax")
    private String stateTax;
    @Column(name = "product_value")
    private String productValue;
    @Column(name = "discount_value")
    private String discountValue;

    public ProductRate() {
    }
}
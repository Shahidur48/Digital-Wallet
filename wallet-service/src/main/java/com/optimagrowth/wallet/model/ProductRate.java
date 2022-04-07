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

    @Column(name = "min_value")
    private Long minValue;
    @Column(name = "max_value")
    private Long maxValue;
    @Column(name = "role_id")
    private Long roleId;
    @Column(name = "state_tax")
    private Long stateTax;
    @Column(name = "product_value")
    private Long productValue;
    @Column(name = "discount_value")
    private Long discountValue;

    public ProductRate() {
    }
}
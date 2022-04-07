package com.optimagrowth.product.repository;


import com.optimagrowth.product.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {
}

package com.product.details.repository;

import com.product.details.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDetialsRepository extends JpaRepository<Product, Long> {
}

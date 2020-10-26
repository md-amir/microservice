package com.product.details.service;

import com.product.details.entity.Product;
import com.product.details.repository.ProductDetialsRepository;
import com.product.details.taskinterface.ProductInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDetailsService implements ProductInterface {

    @Autowired
    ProductDetialsRepository repository;

    @Override
    public Product getProductDetails(Long id) {
        return  repository.findById(id).orElse(null);
    }
}

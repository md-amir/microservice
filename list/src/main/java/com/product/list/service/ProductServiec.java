package com.product.list.service;

import com.product.list.model.entity.Product;
import com.product.list.repository.ProductRepository;
import com.product.list.taskinterface.Producttask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiec implements Producttask {

    @Autowired
   private ProductRepository repository;

    @Override
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @Override
    public Product saveAndUpdateProducts(Product product) {
        return repository.save(product);
    }
}

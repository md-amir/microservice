package com.product.list.controller;

import com.product.list.model.entity.Product;
import com.product.list.service.ProductServiec;
import com.product.list.taskinterface.Producttask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController implements Producttask {
    @Autowired
    private ProductServiec serviec;

    @Override
    @GetMapping("")
    public List<Product> getAllProducts() {
        return serviec.getAllProducts();
    }

    @Override
    @PostMapping("")
    public Product saveAndUpdateProducts(Product product) {
        return serviec.saveAndUpdateProducts(product);
    }
}

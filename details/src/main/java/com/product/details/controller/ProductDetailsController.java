package com.product.details.controller;

import com.product.details.entity.Product;
import com.product.details.service.ProductDetailsService;
import com.product.details.taskinterface.ProductInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("details")
public class ProductDetailsController implements ProductInterface {

    @Autowired
    ProductDetailsService service;

    @Override
    @GetMapping("/{id}")
    public Product getProductDetails(@PathVariable Long id) {
        return service.getProductDetails(id);
    }
}

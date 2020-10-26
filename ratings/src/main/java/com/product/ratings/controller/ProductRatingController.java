package com.product.ratings.controller;

import com.product.ratings.productinterface.ProductInterface;
import com.product.ratings.serviec.ProductRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public class ProductRatingController implements ProductInterface {

    @Autowired
    ProductRatingService service;

    @Override
    @GetMapping("")
    public Integer getRatings(Long id) {
        return service.getRatings(id);
    }
}

package com.product.ratings.serviec;

import com.product.ratings.productinterface.ProductInterface;
import com.product.ratings.repository.ProductRatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductRatingService implements ProductInterface {

    @Autowired
    private ProductRatingRepository repository;

    @Override
    public Integer getRatings(Long id) {
        return repository.getOne(id).getRatings();
    }
}

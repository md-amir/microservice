package com.product.list.taskinterface;

import com.product.list.model.entity.Product;

import java.util.List;

public interface Producttask {
   public List<Product> getAllProducts();

   public Product saveAndUpdateProducts(Product product);
}

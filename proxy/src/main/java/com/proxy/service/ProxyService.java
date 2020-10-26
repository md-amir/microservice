package com.proxy.service;

import com.proxy.dto.ProductDto;
import org.json.simple.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "apigateway")
public interface ProxyService {

    @GetMapping("/product-list-service/products")
    public ResponseEntity<JSONObject> getAllProducts() ;
}

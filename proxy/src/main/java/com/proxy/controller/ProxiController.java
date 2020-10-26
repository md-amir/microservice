package com.proxy.controller;

import com.proxy.dto.ProductDto;
import com.proxy.service.ProxyService;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProxiController {

    @Autowired
    private ProxyService service;

    @GetMapping("")
    public ResponseEntity<JSONObject>getAllProducts() {
        var a = service.getAllProducts();
        return a;
    }





}

package com.telusko2.simpleWebApp.controller;

import com.telusko2.simpleWebApp.model.Product;
import com.telusko2.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @RequestMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }
}

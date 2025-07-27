package com.telusko2.simpleWebApp.service;

import com.telusko2.simpleWebApp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products= Arrays.asList(
            new Product(101,"Iphone",7000),
            new Product(102, "Canon Camera", 4000),
            new Product(103, "zaeis", 5000)
    );
    public List<Product> getProducts() {
          return products;
    }
}

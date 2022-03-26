package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductImpl implements ProductService{
    @Autowired
    ProductRepo productRepo;


    @Override
    public Iterable<Product> view(String tag) {
        return productRepo.view(tag);
    }
}

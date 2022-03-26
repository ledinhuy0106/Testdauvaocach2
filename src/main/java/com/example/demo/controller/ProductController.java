package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin("*")
@RequestMapping("api/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/view")
    public ResponseEntity<Iterable<Product>> view(@RequestParam String tag) {
        Iterable<Product> products= productService.view(tag);
        return new ResponseEntity<>( products,HttpStatus.OK);
    }
}

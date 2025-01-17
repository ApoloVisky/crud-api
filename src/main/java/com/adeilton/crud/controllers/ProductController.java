package com.adeilton.crud.controllers;

import com.adeilton.crud.model.Product;
import com.adeilton.crud.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductRepository repository;

    @GetMapping
    public ResponseEntity getAll() {
        List<Product> products = repository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(products);
    }
}

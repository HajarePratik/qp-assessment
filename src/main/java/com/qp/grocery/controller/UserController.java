package com.qp.grocery.controller;

import com.qp.grocery.entity.Product;
import com.qp.grocery.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getAllProduct")
    public List<Product> getAllProduct() {
        return productService.findAllProduct();
    }

    @GetMapping("/getProductById/{id}")
    public Product getAllProductById(@PathVariable int id) {
        return productService.findProductById(id);
    }

}

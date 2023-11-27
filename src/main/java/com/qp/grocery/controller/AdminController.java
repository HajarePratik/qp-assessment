package com.qp.grocery.controller;


import com.qp.grocery.entity.Product;
import com.qp.grocery.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

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

    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @PutMapping("/updateProductById/{id}")
    public String updateProduct(@PathVariable int id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("/deleteProductById/{id}")
    public String deleteProductById(@PathVariable int id) {
        return productService.deleteProductById(id);
    }

}

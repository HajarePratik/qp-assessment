package com.qp.grocery.service;

import com.qp.grocery.entity.Product;
import com.qp.grocery.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

    public Product findProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }

    public String saveProduct(Product product) {
        productRepository.save(product);
        return "Product Insert Successfully";
    }

    public String updateProduct(int id, Product product) {
        Optional<Product> optional = productRepository.findById(id);
        if (optional.isPresent()) {
            Product existingProduct = optional.get();
            existingProduct.setProduct_Name(product.getProduct_Name());
            existingProduct.setProduct_Price(product.getProduct_Price());
            existingProduct.setProduct_Quantity(product.getProduct_Quantity());
            productRepository.save(existingProduct);
            return "Product Details Updated Successfully";
        } else {
            return "Product Does Not Exist";
        }

    }

    public String deleteProductById(int id) {
        productRepository.deleteById(id);
        return "Product Delete Successfully";
    }
}


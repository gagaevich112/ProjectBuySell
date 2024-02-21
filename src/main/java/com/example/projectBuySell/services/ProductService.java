package com.example.projectBuySell.services;

import com.example.projectBuySell.models.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.example.projectBuySell.repositories.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> listProduct(String title) {
        if(title != null) return productRepository.findByTitle(title);
        return productRepository.findAll();
    }
    public void deleteProduct (Long id) {
        log.info("Product delete {}", id);
        productRepository.deleteById(id);
    }
    public void saveProduct (Product product) {
        log.info("Saving product {}", product);
        productRepository.save(product);
    }
    public Product getProductById(Long id) {
        return  productRepository.findById(id).orElse(null);
    }

    }
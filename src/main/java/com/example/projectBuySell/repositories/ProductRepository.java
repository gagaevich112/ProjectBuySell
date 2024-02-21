package com.example.projectBuySell.repositories;

import com.example.projectBuySell.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<com.example.projectBuySell.models.Product,Long> {
    List<Product> findByTitle(String title);
}

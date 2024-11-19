package com.example.bysell.services;

import com.example.bysell.models.Product;
import com.example.bysell.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j // для того чтобы логить логи
public class ProductService {
    private final ProductRepository productRepository;

// получаем список продуктов
    public List<Product> listProducts(String title) {
        if(title != null) return productRepository.findByTitle(title);
        return productRepository.findAll();
    }

// добавлям продукт в список
    public void saveProduct(Product product) {
        log.info("Saving product: {}", product);
        productRepository.save(product);
    }
// удаляем продукт
    public void removeProduct(Long id) {
        productRepository.deleteById(id);
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null); // findBYId возвращает Optional container
    }
}

package com.codegym.service.product;

import com.codegym.model.Product;
import com.codegym.model.dto.ProductDTO;
import com.codegym.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }


    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void remove(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<ProductDTO> findAllPDTO() {
        return productRepository.findAllPDTO();
    }

    @Override
    public Optional<ProductDTO> findByIdPDTO(Long id) {
        return productRepository.findByIdPDTO(id);
    }
}

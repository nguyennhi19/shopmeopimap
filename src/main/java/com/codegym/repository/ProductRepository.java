package com.codegym.repository;

import com.codegym.model.Product;
import com.codegym.model.dto.CategoryDTO;
import com.codegym.model.dto.CompanyDTO;
import com.codegym.model.dto.ProductDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT NEW com.codegym.model.dto.ProductDTO(u.id, u.name, u.description, u.createdAt, u.image, u.price,u.accede,u.quantity,u.category,u.company) FROM Product u")
    List<ProductDTO> findAllPDTO();

    @Query("SELECT NEW com.codegym.model.dto.ProductDTO(u.id, u.name, u.description, u.createdAt, u.image, u.price,u.accede,u.quantity,u.category,u.company ) FROM Product u where  u.id = ?1")
    Optional<ProductDTO> findByIdPDTO(Long id);
}

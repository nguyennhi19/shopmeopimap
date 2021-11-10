package com.codegym.controller.api;

import com.codegym.model.Category;
import com.codegym.model.Company;
import com.codegym.model.Product;

import com.codegym.model.dto.CategoryDTO;
import com.codegym.model.dto.CompanyDTO;
import com.codegym.model.dto.ProductDTO;
import com.codegym.service.category.CategoryService;
import com.codegym.service.company.CompanyService;
import com.codegym.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductApi {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private CompanyService companyService;


    @GetMapping
    public ResponseEntity<List<?>> getList() {
        List<ProductDTO> productDTOS = productService.findAllPDTO();

        if (productDTOS.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(productDTOS, HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public ProductDTO createId(@PathVariable Long id) {

        ProductDTO product = productService.findByIdPDTO(id).get();

        return product;
    }

    @PostMapping("/create")
    public Product create(@RequestBody Product product) {

        Company company = companyService.save(product.getCompany());
        Category category = categoryService.save(product.getCategory());

        product.setCompany(company);
        product.setCategory(category);

            Product product1 = productService.save(product);

        return product1;
    }

    @PostMapping("/update")
    public ResponseEntity<?> update(@RequestBody Product product) {

        Category category = categoryService.save(product.getCategory());

        product.setCategory(category);

        Product productUpdated = productService.save(product);

        if (productUpdated != null) {
            return new ResponseEntity<>(productUpdated.toProductDTO(), HttpStatus.ACCEPTED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {

        productService.remove(id);

        Optional<Product> product = productService.findById(id);

        if (product.isPresent()) {
            return new ResponseEntity<Boolean>(false, HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
    }
}

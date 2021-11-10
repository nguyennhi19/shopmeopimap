package com.codegym.model.dto;

import com.codegym.model.Category;
import com.codegym.model.Company;
import com.codegym.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class ProductDTO {

    private Long id;

    private String name;
    private String description;

    private Date createdAt = new Date();

    private String image;
    private BigDecimal price;
    private BigDecimal accede;
    private int quantity;

    private CategoryDTO category;
    private CompanyDTO company;

    public ProductDTO(Long id, String name, String description, Date createdAt, String image, BigDecimal price, BigDecimal accede, int quantity, Category category, Company company) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.image = image;
        this.price = price;
        this.accede = accede;
        this.quantity = quantity;
        this.category = category.toCategoryDTO();
        this.company = company.toCompanyDTO();
    }

    public Product product() {
        return new Product()
                .setId(id)
                .setName(name)
                .setDescription(description)
                .setCreatedAt(createdAt)
                .setImage(image)
                .setPrice(price)
                .setAccede(accede)
                .setQuantity(quantity)
                .setCategory(category.toCategory())
                .setCompany(company.toCompany());
    }
}
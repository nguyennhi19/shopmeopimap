package com.codegym.model;

import com.codegym.model.dto.ProductDTO;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
@Accessors(chain = true)
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @CreationTimestamp
    @JsonFormat(pattern = "dd/MM/yyyy hh:mm:ss a")
    private Date createdAt;

    private String image;
    private BigDecimal price;
    private BigDecimal accede;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id", nullable = false)
    @JsonBackReference("category-product")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "id", nullable = false)
    @JsonBackReference("company-product")
    private Company company;

    public ProductDTO toProductDTO() {
        return new ProductDTO()
                .setId(id)
                .setName(name)
                .setAccede(accede)
                .setImage(image)
                .setPrice(price)
                .setQuantity(quantity)
                .setDescription(description)
                .setCategory(category.toCategoryDTO())
                .setCompany(company.toCompanyDTO());
    }

//    @OneToMany(mappedBy = "order_item")
//    private Set<OrderItem> orderItems;
}

package com.codegym.model;

import com.codegym.model.dto.CategoryDTO;
import com.codegym.model.dto.CompanyDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "companys")
@Accessors(chain = true)
public class Company {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(targetEntity = Product.class, mappedBy = "company", fetch = FetchType.EAGER)
    private Set<Product> products;

    public CompanyDTO toCompanyDTO() {
        return new CompanyDTO()
                .setId(id)
                .setName(name)
                ;
    }
}

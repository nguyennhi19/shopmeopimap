package com.codegym.model.dto;

import com.codegym.model.Category;
import com.codegym.model.Company;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CategoryDTO {
    private Long id;
    private String name;

    public Category category(){
        return category()
                .setId(id)
                .setName(name);
    }
}

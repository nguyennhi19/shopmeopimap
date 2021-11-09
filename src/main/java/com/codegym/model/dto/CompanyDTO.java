package com.codegym.model.dto;

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
public class CompanyDTO {
    private Long id;
    private String name;

    public Company company(){
        return company()
                .setId(id)
                .setName(name);
    }
}

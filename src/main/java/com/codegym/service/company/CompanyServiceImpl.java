package com.codegym.service.company;

import com.codegym.model.Company;
import com.codegym.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyRepository companyRepository;
    @Override
    public Iterable<Company> findAll() {
        return companyRepository.findAll();
    }

    @Override
    public Optional<Company> findById(Long id) {
        return companyRepository.findById(id);
    }

    @Override
    public Company save(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public void remove(Long id) {
        companyRepository.deleteById(id);
    }
}

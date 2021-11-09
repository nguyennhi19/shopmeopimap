package com.codegym.controller;

import com.codegym.model.Category;
import com.codegym.model.Company;
import com.codegym.model.Product;
import com.codegym.service.category.CategoryService;
import com.codegym.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/services")
public class ServiceController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private CompanyService companyService;


    @GetMapping
    public ModelAndView getListCategory() {
        ModelAndView modelAndView = new ModelAndView();

        Iterable<Category> categories = categoryService.findAll();
        Iterable<Company> companies = companyService.findAll();
        modelAndView.setViewName("/product/listService");
        modelAndView.addObject("companies", companies);
        modelAndView.addObject("categories", categories);
        return modelAndView;
    }
}

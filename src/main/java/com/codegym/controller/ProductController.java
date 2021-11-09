package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ModelAndView getList() {
        ModelAndView modelAndView = new ModelAndView();

        Iterable<Product> products = productService.findAll();
        modelAndView.setViewName("/product/list");
        modelAndView.addObject("products", products);
        return modelAndView;
    }
}

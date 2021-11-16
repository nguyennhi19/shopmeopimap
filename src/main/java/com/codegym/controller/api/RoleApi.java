package com.codegym.controller.api;

import com.codegym.model.Role;
import com.codegym.model.User;
import com.codegym.service.role.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/role")
public class RoleApi {
    @Autowired
    private RoleService roleService;

    @GetMapping
    public Iterable<Role> getListRole() {

        Iterable<Role> roles = roleService.findAll();

        return roles;
    }
}

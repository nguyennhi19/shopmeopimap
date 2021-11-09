package com.codegym.controller.api;

import com.codegym.model.Category;
import com.codegym.model.Company;
import com.codegym.model.Product;
import com.codegym.model.User;
import com.codegym.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserApi {
    @Autowired
    private UserService userService;

    @GetMapping
    public Iterable<User> getListProduct() {

        Iterable<User> users = userService.findAll();

        return users;
    }

    @GetMapping("/{id}")
    public User createId(@PathVariable Long id) {

        User user = userService.findById(id).get();

        return user;
    }

    @PostMapping("/create")
    public User create(@RequestBody User user) {


        User user1 = userService.save(user);

        return user1;
    }

    @PostMapping("/update")
    public User update(@RequestBody User user) {

        User user1 = userService.save(user);

        return user1;
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {

        userService.remove(id);

        Optional<User> user= userService.findById(id);

        if (user.isPresent()) {
            return new ResponseEntity<Boolean>(false, HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
    }
}

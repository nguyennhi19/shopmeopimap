package com.codegym.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String userName;
    private String password;
    private String role;
    private String phone;
    private String address;
    private String email;
    private String image;

    private String createdAt;

    @Column(columnDefinition = "boolean default false")
    private boolean isDelete;

    private double salary;

}

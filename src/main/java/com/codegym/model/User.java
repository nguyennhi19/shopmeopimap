package com.codegym.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
@Accessors(chain = true)
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String userName;
    private String password;
    private String phone;
    private String address;
    private String email;
    private String image;

    @JsonFormat(pattern = "dd/MM/yyyy hh:mm:ss a")
    @CreationTimestamp
    private Date createdAt;

    @Column(columnDefinition = "boolean default false")
    private boolean isDelete;

    private double salary;
}

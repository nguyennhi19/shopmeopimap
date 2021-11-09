//package com.codegym.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.util.Set;
//
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@Table(name = "customers")
//public class Customer {
//
//    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
//    private Long id;
//
//    private String name;
//    private String phone;
//    private String address;
//    private String email;
//    private String note;
//
////    @ManyToOne
////    @JoinColumn(name = "location_region_id", referencedColumnName = "id", unique = true, nullable = false)
////    private LocationRegion locationRegion;
////
////    @OneToMany(mappedBy = "customer")
////    private Set<Order> orders;
//}

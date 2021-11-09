//package com.codegym.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.math.BigDecimal;
//
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@Table(name = "orderItems")
//public class OrderItem {
//    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
//    private Long id;
//    private int quantity;
//    private BigDecimal price;
//
////    @ManyToOne
////    @JoinColumn(name = "product_id", referencedColumnName = "id", unique = true, nullable = false)
////    private Product product;
////    @ManyToOne
////    @JoinColumn(name = "order_id", referencedColumnName = "id", unique = true, nullable = false)
////    private Order order;
//
//}

package com.codegym.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private BigDecimal amount;
    private BigDecimal totalAmount;
    private BigDecimal vat;
    private OrderStatus status;
    private String createdAt;

//    @ManyToOne
//    @JoinColumn(name = "customer_id", referencedColumnName = "id", unique = true, nullable = false)
//    private Customer customer;
//
//    @OneToMany(mappedBy = "order_item")
//    private Set<OrderItem> orderItems;
}

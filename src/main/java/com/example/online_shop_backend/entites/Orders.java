package com.example.online_shop_backend.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class Orders {
    @Id
    @SequenceGenerator(
            name = "orderId_sequence",
            sequenceName = "orderId_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "orderId_sequence"
    )
    private long orderId;
    private LocalDate orderDate;
    private double totalAmount;
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "userID"
    )
    private Users users;
    @ManyToMany(
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name = " Order_Items Table",
            joinColumns = @JoinColumn(
                    name = "order_id",
                    referencedColumnName = "orderId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "product_id",
                    referencedColumnName = "productId"
            )
    )
    private List<Product> productList;



}


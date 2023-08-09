package com.example.online_shop_backend.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class Product {
    @Id
    @SequenceGenerator(
            name = "productId_sequence",
            sequenceName = "productId_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "productId_sequence"
    )
    private long productId;
    private String productName;
    private double price;
//    @OneToOne(
//            cascade = CascadeType.ALL
//    )
//    @JoinColumn(
//            name = "product_catagory_id",
//            referencedColumnName = "productCatagoryId"
//    )
//    private ProductCatagory productCatagory;
//
//    @OneToOne(
//            cascade = CascadeType.ALL
//    )
//    @JoinColumn(
//            name = "shop_id",
//            referencedColumnName = "shopId"
//    )
//    private Shop shop;





}

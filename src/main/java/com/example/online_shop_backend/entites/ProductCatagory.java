package com.example.online_shop_backend.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class ProductCatagory {
    @Id
    @SequenceGenerator(
            name = "productCatagoryId_sequence",
            sequenceName = "productCatagoryId_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "productCatagoryId_sequence"
    )
    private long productCatagoryId;
    private String productCatagoryName;



}

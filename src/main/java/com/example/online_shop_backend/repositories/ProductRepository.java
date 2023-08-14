package com.example.online_shop_backend.repositories;

import com.example.online_shop_backend.entites.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.net.ContentHandler;

@Repository
public interface ProductRepository extends JpaRepository <Product, Long> {


    Page<Product> findProductByProductNameContaining(
            String title,
            Pageable pageable);
}

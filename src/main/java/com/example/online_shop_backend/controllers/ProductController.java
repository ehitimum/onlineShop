package com.example.online_shop_backend.controllers;

import com.example.online_shop_backend.entites.Product;
import com.example.online_shop_backend.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;
    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @PostMapping("/productlist")
    public List<Product> addManyProducts(@RequestBody List<Product> products){
        return productService.addManyProducts(products);
    }
    @GetMapping("/productlist")
    public ResponseEntity<Page<Product>> getProducts(@RequestParam(defaultValue = "1") int page) {
        Page<Product> productPage = productService.getProductsListWithPagination(page);
        return ResponseEntity.ok(productPage);
    }

    @GetMapping("/search")
    public ResponseEntity<Page<Product>> getProductsBySearch(@RequestParam String searchElement, @RequestParam(defaultValue = "1") int page) {
        Page<Product> productPage = productService.getProductBySearch(searchElement, page);
        return ResponseEntity.ok(productPage);
    }
}

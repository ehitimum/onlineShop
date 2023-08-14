package com.example.online_shop_backend.services;

import com.example.online_shop_backend.entites.Product;
import com.example.online_shop_backend.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Service
public class ProductService {
    private final ProductRepository productRepository;
    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> addManyProducts(List<Product> products){
        return productRepository.saveAll(products);
    }

    public Page<Product> getProductsListWithPagination(int pageNumber) {
        int pageSize = 5; // Number of products per page

        Pageable pageRequest = PageRequest.of(pageNumber - 1, pageSize); // Adjusting page number to 0-based index

        Page<Product> productPage = productRepository.findAll(pageRequest);

//        System.out.println("Total Pages = " + productPage.getTotalPages());
//        System.out.println("Total Elements = " + productPage.getTotalElements());

        return productPage;
    }

    public Page<Product> getProductBySearch(String searchElement, int pageNumber){
        int pageSize = 10; // Number of products per page

        Pageable pageRequest = PageRequest.of(pageNumber - 1, pageSize);

        return productRepository.findProductByProductNameContaining(searchElement, pageRequest);
    }

}

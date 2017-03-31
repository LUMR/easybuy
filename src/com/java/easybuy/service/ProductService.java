package com.java.easybuy.service;

import com.java.easybuy.vo.Product;

import java.util.List;

/**
 * product
 * Created by lumr on 2017/3/30.
 */
public interface ProductService {
    List<Product> getProductsById(int id);
    List<Product> getAllProducts();
    List<Product> getAllProducts(int page);

    Product getProductById(int id);
}

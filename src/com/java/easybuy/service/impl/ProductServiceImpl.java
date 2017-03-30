package com.java.easybuy.service.impl;

import com.java.easybuy.dao.ProductDao;
import com.java.easybuy.dao.impl.ProductDaoImpl;
import com.java.easybuy.service.ProductService;
import com.java.easybuy.vo.Product;

import java.util.List;

/**
 * Created by lumr on 2017/3/30.
 */
public class ProductServiceImpl implements ProductService {
    @Override
    public List<Product> getProductsById(int id) {
        ProductDao dao = new ProductDaoImpl();
        return dao.getAllByCategoryLevel3Id(id);
    }

    @Override
    public List<Product> getAllProducts() {
        ProductDao dao = new ProductDaoImpl();
        return dao.getAllProducts(0,20);
    }

    @Override
    public List<Product> getAllProducts(int page) {
        ProductDao dao = new ProductDaoImpl();
        return dao.getAllProducts(page,20);
    }

    @Override
    public Product getProductById(int id) {
        ProductDao dao = new ProductDaoImpl();
        return dao.getProduct(id);
    }
}

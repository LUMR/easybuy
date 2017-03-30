package com.java.easybuy.dao;

import com.java.easybuy.vo.Category;
import com.java.easybuy.vo.Product;

import java.util.List;

/**
 * 商品dao
 * Created by fsweb on 17-3-30.
 */
public interface ProductDao {
    /**
     * 根据商品类别获取该类别所有商品
     * @param category
     * @return 返回商品的结果集
     */
    List<Product> getAllProducts(Category category);
    List<Product> getAllProducts(int page,int pageSize);

    /**
     * 根据商品id返回对应的商品
     * @param id 商品id
     * @return
     */
    Product getProduct(int id);

    List<Product> getAllByCategoryLevel3Id(int cid);

    int addProduct(Product product);

    int upDateProduct(Product product);
}

package com.java.easybuy.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * 购物车
 * Created by fsweb on 17-3-30.
 */
public class BuyCar {
    private User user;
    private List<Product> products;

    public BuyCar() {
        products = new ArrayList<>();
    }

    public void add(Product product) {
        products.add(product);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}

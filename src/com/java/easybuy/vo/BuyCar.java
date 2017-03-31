package com.java.easybuy.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * 购物车
 * Created by fsweb on 17-3-30.
 */
public class BuyCar {
    private User user;
    private double total;
    private List<Product> products;

    public BuyCar() {
        products = new ArrayList<>();
    }

    private int contains(Product product) {
        if (product == null)
            return -1;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == product.getId())
                return i;
        }
        return -1;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    private void resetTotal() {
        total = 0;
        for (Product product : products) {
            total += product.getPrice() * product.getCount();
        }
    }

    public void add(Product product) {
        int i = contains(product);
        if (i >= 0)
            products.get(i).setCount(products.get(i).getCount() + product.getCount());
        else
            products.add(product);
        resetTotal();
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

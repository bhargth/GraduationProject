package com.example.GraduationProject.Business;


import com.example.GraduationProject.Business.Entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {


    List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(long productId){
        products.removeIf(p -> p.getProductID() == productId);
    }

    public int getTotalPrice(){
        int sum = 0;
        for (Product p:products) {
            sum += p.getPrice();
        }
        return sum;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}

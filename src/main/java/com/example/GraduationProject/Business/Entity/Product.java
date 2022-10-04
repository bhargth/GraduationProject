package com.example.GraduationProject.Business.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productID;
    private int price;
    private String size;
    private String description;

    public Product() {
    }

    public Product(long productID, int price, String size, String description) {
        this.productID = productID;
        this.price = price;
        this.size = size;
        this.description = description;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

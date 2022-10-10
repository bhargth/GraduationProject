package com.example.GraduationProject.Business.Entity;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productID;

    @Lob
    byte[] imageData;
    private int price;
    private String size;
    private String description;

    public Product() {
    }

    public Product(int price, String size, String description) {
        this.price = price;
        this.size = size;
        this.description = description;
    }

    public Product(byte[] imageData, int price, String size, String description) {
        this.imageData = imageData;
        this.price = price;
        this.size = size;
        this.description = description;
    }

    public Product(byte[] bytes) {
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

    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
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

package com.example.GraduationProject.Business;


import com.example.GraduationProject.Business.Entity.Product;
import com.example.GraduationProject.RepositoryLayer.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
@SessionScope
public class ProductService {

    Product product;


    @Autowired
    ProductRepository prodrepo;

    public List<Product> getProducts() {
        List<Product>products;
        products = prodrepo.findAll();
        return products;
    }

    /*public void addProductImage(MultipartFile file){
        try {
            prodrepo.save(new Product(file.getBytes()));
        } catch (IOException e) {
            throw new RuntimeException("storing Image:" + e);
        }
    }*/
    public void addProductDetails(Product product){
        prodrepo.save(product);
    }

    public Product getProduct(Long id) {
       return prodrepo.findById(id).get();


    }
}

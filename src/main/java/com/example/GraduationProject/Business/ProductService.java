package com.example.GraduationProject.Business;


import com.example.GraduationProject.Business.Entity.Product;
import com.example.GraduationProject.RepositoryLayer.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
@SessionScope
public class ProductService {


    @Autowired
    ProductRepository prodrepo;

    public List<Product> getProducts() {
        List<Product>products;
        products = prodrepo.findAll();
        return products;
    }
}

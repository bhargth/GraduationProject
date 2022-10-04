package com.example.GraduationProject.PresentationLayer;

import com.example.GraduationProject.Business.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class Controller {

    @Autowired
    ShoppingCart shoppingCart;

    @GetMapping("/")
    public String home() { return  "index" ;}
}



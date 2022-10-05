package com.example.GraduationProject.PresentationLayer;

import com.example.GraduationProject.Business.CustomerService;
import com.example.GraduationProject.Business.Entity.Customer;
import com.example.GraduationProject.Business.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

@Autowired
    CustomerService custser;

    @GetMapping("/")
    public String home() { return  "homePage" ;}

    @RequestMapping("/signupForm")
    public String signUp() { return  "signupForm" ;}

    @RequestMapping("/LoginPage")
    public String logIn() { return  "LoginPage" ;}

    @RequestMapping("/HowitWorks")
    public String howItWorks() { return  "HowitWorks" ;}

    @RequestMapping("/aboutusPage")
    public String aboutUs() {
        return  "aboutusPage" ;
    }

    @RequestMapping("/products")
    public String products() { return  "products" ;}


}





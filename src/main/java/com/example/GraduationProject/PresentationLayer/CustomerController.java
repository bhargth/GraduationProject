package com.example.GraduationProject.PresentationLayer;

import com.example.GraduationProject.Business.CustomerService;
import com.example.GraduationProject.Business.Entity.Customer;
import com.example.GraduationProject.Business.Entity.Product;
import com.example.GraduationProject.Business.ProductService;
import com.example.GraduationProject.Business.ShoppingCart;
import com.example.GraduationProject.RepositoryLayer.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CustomerController {

@Autowired
    CustomerService custser;

@Autowired
    ProductService prodser;

    @GetMapping("/")
    public String home() { return  "homePage" ;}

    @GetMapping("/signupForm")
    public String signUp(Model model) {
    model.addAttribute("customer", new Customer());
    return "signupForm";
    }

@PostMapping("/signupForm")
public String signupSubmit(@ModelAttribute Customer customer, Model model){
custser.signUp(customer);
model.addAttribute("products", prodser.getProducts());
return "products";
}

    @GetMapping("/LoginPage")
    public String logIn() { return  "LoginPage" ;}

    @PostMapping("/LoginPage")
    public String logIn(@RequestParam("customername") String name, Model model){

       if(custser.login(name)){
           model.addAttribute("customername",name);
           return "products";
       }else {
           model.addAttribute("message", "Try again!");
           return "LoginPage";
       }

    }


    @GetMapping("/products")
    public String displayProducts(Model model){
        model.addAttribute("products", prodser.getProducts());
        return "products";
    }



    @GetMapping("/shoppingcart")
    public String shoppingCart(Model model) {
        model.addAttribute("cart", custser.getCart());
        return  "ShoppingCart" ;
    }
    @PostMapping("/addtocart/{productId}")
    public String addToCart(@PathVariable long productId, Model model){
        custser.addToCart(productId);
        model.addAttribute("products", prodser.getProducts());
        return "products";
    }







    @RequestMapping("/HowitWorks")
    public String howItWorks() { return  "HowitWorks" ;}

    @RequestMapping("/aboutusPage")
    public String aboutUs() {
        return  "aboutusPage" ;
    }






    }







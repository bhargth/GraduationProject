package com.example.GraduationProject.PresentationLayer;

import com.example.GraduationProject.Business.CustomerService;
import com.example.GraduationProject.Business.Entity.Customer;
import com.example.GraduationProject.Business.Entity.Payment;
import com.example.GraduationProject.Business.PaymentService;
import com.example.GraduationProject.Business.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CustomerController {

@Autowired
    CustomerService custser;

@Autowired
    ProductService prodser;

@Autowired
    PaymentService paySer;

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
           model.addAttribute("products", prodser.getProducts());
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
        return "redirect:/products";
    }

    @GetMapping("/paymentform")
    public String paymentForm(Model model){
        model.addAttribute("payment", new Payment());
        return  "paymentform" ;
    }

    @PostMapping("/paymentform")
    public String makePayment(@ModelAttribute Payment payment, Model model){
        paySer.makePayment(payment);
        model.addAttribute("payment", payment);
        return "orderplace";
    }



    @RequestMapping("/HowitWorks")
    public String howItWorks() { return  "HowitWorks" ;}

    @RequestMapping("/aboutusPage")
    public String aboutUs() {
        return  "aboutusPage" ;
    }






    }







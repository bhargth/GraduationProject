package com.example.GraduationProject.PresentationLayer;

import com.example.GraduationProject.Business.CustomerService;
import com.example.GraduationProject.Business.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CustomerController {

@Autowired
    CustomerService custser;

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
model.addAttribute("customer",customer);
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




    @RequestMapping("/HowitWorks")
    public String howItWorks() { return  "HowitWorks" ;}

    @RequestMapping("/aboutusPage")
    public String aboutUs() {
        return  "aboutusPage" ;
    }

    @RequestMapping("/products")
    public String products() { return  "products" ;}



    }







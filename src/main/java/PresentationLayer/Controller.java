package PresentationLayer;

import Service.Customer;
import Service.Product;
import Service.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class Controller {

    @Autowired
    Customer customer;

    @Autowired
    Product product;

    @Autowired
    ShoppingCart shoppingCart;

    @GetMapping("/")
    public String home() { return  "index" ;}
}

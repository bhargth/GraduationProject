package com.example.GraduationProject.Business;

import com.example.GraduationProject.Business.Entity.Customer;
import com.example.GraduationProject.Business.Entity.Product;
import com.example.GraduationProject.RepositoryLayer.CustomerRepository;
import com.example.GraduationProject.RepositoryLayer.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@SessionScope
@Service
public class CustomerService {
    Customer customer;

    @Autowired
    CustomerRepository custRep;

    @Autowired
    ProductRepository prodRep;

    ShoppingCart cart = new ShoppingCart();

    public CustomerService() {
    }


    public boolean login(String customerName) {
        List<Customer> clist = custRep.findByName(customerName);
        if(clist.size()>0) {
            customer = clist.get(0);
            return true;
        } else {
            return false;
        }
    }

    public void signUp(Customer customer){
        custRep.save(customer);

    }

    public void addToCart(long productId){
        Product p= prodRep.findById(productId).get();
        cart.addProduct(p);
    }

    public ShoppingCart getCart(){
        return cart;
    }

}

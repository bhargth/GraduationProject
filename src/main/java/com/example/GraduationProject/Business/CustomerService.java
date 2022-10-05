package com.example.GraduationProject.Business;

import com.example.GraduationProject.Business.Entity.Customer;
import com.example.GraduationProject.RepositoryLayer.CustomerRepository;
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

    public CustomerService() {
    }


    /*public boolean login(String customerName) {
        List<Customer> clist = custRep.findByName(customerName);
        if(clist.size()>0) {
            customer = clist.get(0);
            return true;
        } else {
            return false;
        }
    }

    public void signUp(Customer customer){
        List<Customer> clist = new ArrayList<>();
        clist.add(customer);
        custRep.save(new Customer((Customer) clist));
    }
*/
}

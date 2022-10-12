package com.example.GraduationProject.Business.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

public class CustomerOrders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long orderID;

    @OneToMany
    List<Product> orderedProducts = new ArrayList<>();

    @ManyToOne
    Customer customer;


}

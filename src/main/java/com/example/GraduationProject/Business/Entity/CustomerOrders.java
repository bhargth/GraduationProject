package com.example.GraduationProject.Business.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerOrders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderID;
}

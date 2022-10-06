package com.example.GraduationProject.RepositoryLayer;

import com.example.GraduationProject.Business.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository <Customer, Long>{

    List<Customer> findByName(String customerName);
}

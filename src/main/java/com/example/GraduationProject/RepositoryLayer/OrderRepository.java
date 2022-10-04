package com.example.GraduationProject.RepositoryLayer;

import com.example.GraduationProject.Business.Entity.CustomerOrders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<CustomerOrders, Integer> {
}

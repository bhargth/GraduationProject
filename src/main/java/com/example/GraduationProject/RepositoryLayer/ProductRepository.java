package com.example.GraduationProject.RepositoryLayer;

import com.example.GraduationProject.Business.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}

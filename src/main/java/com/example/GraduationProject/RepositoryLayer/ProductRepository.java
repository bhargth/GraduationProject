package com.example.GraduationProject.RepositoryLayer;

import com.example.GraduationProject.Business.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

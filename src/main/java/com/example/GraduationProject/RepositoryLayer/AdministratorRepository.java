package com.example.GraduationProject.RepositoryLayer;

import com.example.GraduationProject.Business.Entity.Administrator;
import com.example.GraduationProject.Business.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministratorRepository extends JpaRepository<Administrator, Integer> {
}

package com.example.GraduationProject.Business;

import com.example.GraduationProject.Business.Entity.Payment;
import com.example.GraduationProject.RepositoryLayer.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@SessionScope
@Service
public class PaymentService {

    Payment payment;

    @Autowired
    PaymentRepository payRepo;


    public PaymentService() {
    }

    public void makePayment(Payment payment){
        payRepo.save(payment);
    }


}

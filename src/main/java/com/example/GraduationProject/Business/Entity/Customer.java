package com.example.GraduationProject.Business.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerID;
    private String name;
    private int mobileNumber;
    private String emailID;
    private String address;



    public Customer() {
    }

    public Customer(Customer customer) {
    }

    public Customer(String customerName) {
        this.name = customerName;
    }

    public Customer(long customerID, String name, int mobileNumber, String emailID, String address) {
        this.customerID = customerID;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.emailID = emailID;
        this.address = address;
    }




    public long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", customerName='" + name + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", emailID='" + emailID + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

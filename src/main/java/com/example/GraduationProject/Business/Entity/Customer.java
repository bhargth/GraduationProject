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
    private String customerName;
    private int mobileNumber;
    private String emailID;
    private String address;



    public Customer() {
    }

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public Customer(long customerID, String customerName, int mobileNumber, String emailID, String address) {
        this.customerID = customerID;
        this.customerName = customerName;
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


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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
                ", customerName='" + customerName + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", emailID='" + emailID + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

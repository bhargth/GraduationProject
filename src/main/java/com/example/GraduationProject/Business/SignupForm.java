package com.example.GraduationProject.Business;

public class SignupForm {

    private String customerName;
    private int mobileNumber;
    private String emailID;
    private String address;

    public SignupForm() {
    }

    public SignupForm(String customerName, int mobileNumber, String emailID, String address) {
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
        this.emailID = emailID;
        this.address = address;
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
}

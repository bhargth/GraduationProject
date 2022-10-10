package com.example.GraduationProject.Business.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long paymentID;

    private int cardNum;
    private String expiryDate;
    private int cvvNumber;
    private String nameOnCard;

    public Payment() {
    }

    public Payment(long paymentID, int cardNum, int cvvNumber, String expiryDate, String nameOnCard) {
        this.paymentID = paymentID;
        this.cardNum = cardNum;
        this.expiryDate = expiryDate;
        this.cvvNumber = cvvNumber;
        this.nameOnCard = nameOnCard;
    }

    public long getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(long paymentID) {
        this.paymentID = paymentID;
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getCvvNumber() {
        return cvvNumber;
    }

    public void setCvvNumber(int cvvNumber) {
        this.cvvNumber = cvvNumber;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID=" + paymentID +
                ", cardNumber=" + cardNum +
                ", expiryDate='" + expiryDate + '\'' +
                ", cvvNumber=" + cvvNumber +
                ", nameOnCard='" + nameOnCard + '\'' +
                '}';
    }
}

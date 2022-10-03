package RepositoryLayer;

public class Payment {
    private long paymentID;
    private long cardNumber;
    private String expiryDate;
    private String nameOnCard;

    public Payment() {
    }

    public Payment(long paymentID, long cardNumber, String expiryDate, String nameOnCard) {
        this.paymentID = paymentID;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.nameOnCard = nameOnCard;
    }

    public long getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(long paymentID) {
        this.paymentID = paymentID;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
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
                ", cardNumber=" + cardNumber +
                ", expiryDate='" + expiryDate + '\'' +
                ", nameOnCard='" + nameOnCard + '\'' +
                '}';
    }
}

package model;

import java.util.Date;

public class Order {
    int id;
    String deliveryAddress;
    Date orderDate;
    double amount;
 String resturantName;
 long contact;
 String customerName;

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getAmount() {
        return amount;
    }

    public String getResturantName() {
        return resturantName;
    }

    public void setResturantName(String resturantName) {
        this.resturantName = resturantName;
    }

    public void setAmount(double amount) {
        this.amount = amount;

    }
}

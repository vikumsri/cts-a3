package com.abc.models;

import org.springframework.data.annotation.Id;

public class OrderModel {

    private int orderId;
    private Item itemsDetails;
    private Customer customerDetails;

    private String status;

    public OrderModel() {
    }

    public OrderModel(int orderId, Item itemsDetails, Customer customerDetails,String status) {
        this.orderId = orderId;
        this.itemsDetails = itemsDetails;
        this.customerDetails = customerDetails;
        this.status=status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Item getItemsDetails() {
        return itemsDetails;
    }

    public void setItemsDetails(Item itemsDetails) {
        this.itemsDetails = itemsDetails;
    }

    public Customer getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(Customer customerDetails) {
        this.customerDetails = customerDetails;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

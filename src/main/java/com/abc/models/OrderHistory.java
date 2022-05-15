package com.abc.models;

public class OrderHistory {

    private int orderId;
    private Item itemsDetails;

    private String status;

    public OrderHistory() {
    }

    public OrderHistory(int orderId, Item itemsDetails, String status) {
        this.orderId = orderId;
        this.itemsDetails = itemsDetails;

        this.status = status;
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


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

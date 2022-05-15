package com.abc.models;

public class Customer {
    private int customerId;
    private String customerName;
    private String address;
    private String contactNo;
    private String nic;

    public Customer() {
    }

    public Customer(int customerId, String customerName, String address, String contactNo, String nic) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.contactNo = contactNo;
        this.nic = nic;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }
}

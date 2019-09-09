package com.example.camundagradle.models;

import java.io.Serializable;

public class Account implements Serializable {
    private Customer customer;
    private Integer balance;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}

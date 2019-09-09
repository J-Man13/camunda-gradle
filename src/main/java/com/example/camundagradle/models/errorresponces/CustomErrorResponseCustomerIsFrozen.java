package com.example.camundagradle.models.errorresponces;

public class CustomErrorResponseCustomerIsFrozen extends CustomErrorResponse {
    private int customerServiceResponceStatus;

    public CustomErrorResponseCustomerIsFrozen(){
        super();
    }

    public int getCustomerServiceResponceStatus() {
        return customerServiceResponceStatus;
    }

    public void setCustomerServiceResponceStatus(int customerServiceResponceStatus) {
        this.customerServiceResponceStatus = customerServiceResponceStatus;
    }
}

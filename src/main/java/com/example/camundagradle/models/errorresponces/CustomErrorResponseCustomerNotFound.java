package com.example.camundagradle.models.errorresponces;

public class CustomErrorResponseCustomerNotFound extends CustomErrorResponse {
    private int customerServiceResponceStatus;


   public CustomErrorResponseCustomerNotFound(){
       super();
   }

    public int getCustomerServiceResponceStatus() {
        return customerServiceResponceStatus;
    }

    public void setCustomerServiceResponceStatus(int customerServiceResponceStatus) {
        this.customerServiceResponceStatus = customerServiceResponceStatus;
    }
}

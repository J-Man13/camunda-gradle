package com.example.camundagradle.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerDTO implements Serializable {
    @JsonProperty("cif")
    private String cif;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("balanceAccount")
    private String balanceAccount;

    @JsonProperty("certNumber")
    private String certNumber;

    public CustomerDTO() {

    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getBalanceAccount() {
        return balanceAccount;
    }

    public void setBalanceAccount(String balanceAccount) {
        this.balanceAccount = balanceAccount;
    }

    public String getCertNumber() {
        return certNumber;
    }

    public void setCertNumber(String certNumber) {
        this.certNumber = certNumber;
    }

    public Customer ToCustomer(){
        Customer customer = new Customer();
        customer.setCif(getCif());
        customer.setCurrency(getCurrency());
        customer.setBalanceAccount(getBalanceAccount());
        customer.setCertNumber(getCertNumber());
        return customer;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "cif='" + cif + '\'' +
                ", currency='" + currency + '\'' +
                ", balanceAccount='" + balanceAccount + '\'' +
                ", certNumber='" + certNumber + '\'' +
                '}';
    }
}

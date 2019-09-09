package com.example.camundagradle.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Customer implements Serializable {
    private String cif;
    private String currency;
    private String balanceAccount;
    private String certNumber;
    public Boolean isfrozen;

    public Customer() {

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

    public Boolean getIsfrozen() {
        return isfrozen;
    }

    public void setIsfrozen(Boolean isfrozen) {
        this.isfrozen = isfrozen;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cif='" + cif + '\'' +
                ", currency='" + currency + '\'' +
                ", balanceAccount='" + balanceAccount + '\'' +
                ", certNumber='" + certNumber + '\'' +
                ", isfrozen=" + isfrozen +
                '}';
    }
}

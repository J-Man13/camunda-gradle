package com.example.camundagradle.services;

import com.example.camundagradle.models.Account;
import com.example.camundagradle.models.Customer;




public interface IAccountService {
    Account addAccount(Customer customer);
}

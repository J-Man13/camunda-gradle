package com.example.camundagradle.services;

import com.example.camundagradle.models.Account;
import com.example.camundagradle.models.Customer;
import org.springframework.stereotype.Service;

@Service
public class AccountMockService implements IAccountService{
    @Override
    public Account addAccount(Customer customer) {
        Account account = new Account();
        account.setCustomer(customer);
        account.setBalance(3030);
        return account;
    }
}

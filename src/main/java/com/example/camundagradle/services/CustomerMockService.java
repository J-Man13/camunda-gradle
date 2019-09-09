package com.example.camundagradle.services;

import com.example.camundagradle.models.Customer;
import com.example.camundagradle.models.CustomerDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class CustomerMockService implements ICustomerService{

    @Override
    public Customer getCustomer(CustomerDTO customerDTO){
        Customer customer = customerDTO.ToCustomer();
        customer.setIsfrozen(Math.random() < 0.5);
        return customer;
    }
}

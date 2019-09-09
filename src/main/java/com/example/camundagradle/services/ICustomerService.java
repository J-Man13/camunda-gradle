package com.example.camundagradle.services;

import com.example.camundagradle.models.Customer;
import com.example.camundagradle.models.CustomerDTO;

public interface ICustomerService{
    Customer getCustomer(CustomerDTO customerDTO);
}

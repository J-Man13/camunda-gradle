package com.example.camundagradle.delegates;

import com.example.camundagradle.models.Customer;
import com.example.camundagradle.models.CustomerDTO;
import com.example.camundagradle.services.ICustomerService;
import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;

@Component
public class CustomerExtractionDelegate implements JavaDelegate {
    @Autowired
    @Qualifier("customerMockService")
    private ICustomerService iCustomerService;

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        try {
            CustomerDTO customerDTO = (CustomerDTO) execution.getVariable("customerDTO");
            Customer customer = iCustomerService.getCustomer(customerDTO);
            if (customer == null)
                execution.setVariable("customer", null);
            else
                execution.setVariable("customer", customer);

            System.out.println();
        }
        catch (Exception exception) {
            execution.setVariable("exeption", exception);
            throw new BpmnError("cif_extraction_error");
        }
    }
}

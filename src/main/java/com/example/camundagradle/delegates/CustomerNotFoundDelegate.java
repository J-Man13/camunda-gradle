package com.example.camundagradle.delegates;

import com.example.camundagradle.models.errorresponces.CustomErrorResponseCustomerNotFound;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class CustomerNotFoundDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        CustomErrorResponseCustomerNotFound customErrorResponceCustomerNotFound = new CustomErrorResponseCustomerNotFound();
        customErrorResponceCustomerNotFound.setStatus(404);
        customErrorResponceCustomerNotFound.setSource("com.example.camundagradle.delegates.CustomerNotFoundDelegate");
        customErrorResponceCustomerNotFound.setTitle("Customer information file was not found by identifier");
        customErrorResponceCustomerNotFound.setCustomerServiceResponceStatus(404);
        execution.setVariable("customErrorResponce",customErrorResponceCustomerNotFound);
    }
}

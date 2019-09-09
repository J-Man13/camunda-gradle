package com.example.camundagradle.delegates;

import com.example.camundagradle.models.errorresponces.CustomErrorResponseCustomerIsFrozen;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class CustomerIsFrozenDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        CustomErrorResponseCustomerIsFrozen customErrorResponceCustomerIsFrozen = new CustomErrorResponseCustomerIsFrozen();
        customErrorResponceCustomerIsFrozen.setStatus(403);
        customErrorResponceCustomerIsFrozen.setSource("com.example.camundagradle.delegates.CustomerIsFrozenDelegate");
        customErrorResponceCustomerIsFrozen.setTitle("Customer is frozen");
        customErrorResponceCustomerIsFrozen.setCustomerServiceResponceStatus(403);
        execution.setVariable("customErrorResponce",customErrorResponceCustomerIsFrozen);
    }
}

package com.example.camundagradle.delegates;

import com.example.camundagradle.models.Account;
import com.example.camundagradle.models.Customer;

import com.example.camundagradle.models.CustomResponseData;
import com.example.camundagradle.services.IAccountService;
import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.awt.peer.ButtonPeer;

@Component
public class AccountCreationDelegate implements JavaDelegate {
    @Autowired
    @Qualifier("accountMockService")
    private IAccountService iAccountService;

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        try {
            Customer customer = (Customer) execution.getVariable("customer");
            Account account = iAccountService.addAccount(customer);
            CustomResponseData<Account> customResponseData = new CustomResponseData<>();
            customResponseData.setStatus(200);
            customResponseData.getData().add(account);
            execution.setVariable("customResponseData",customResponseData);
        }
        catch (Exception exception){
            execution.setVariable("exeption",exception);
            throw new BpmnError("account_creation_error");
        }
    }
}

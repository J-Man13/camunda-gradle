package com.example.camundagradle.delegates;

import com.example.camundagradle.models.ExceptionResponce;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class ExceptionHandleDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        Exception exception = (Exception) execution.getVariable("exeption");
        ExceptionResponce exceptionResponce = new ExceptionResponce();
        exceptionResponce.setStatus(500);
        exceptionResponce.setSource(exception.getStackTrace()[0].getClassName());
        exceptionResponce.setTitle(exception.toString());
        execution.setVariable("exceptionResponce",exceptionResponce);
    }
}

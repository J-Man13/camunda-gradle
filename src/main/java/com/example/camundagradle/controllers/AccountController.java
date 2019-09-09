package com.example.camundagradle.controllers;

import com.example.camundagradle.models.CustomerDTO;
import com.example.camundagradle.models.ExceptionResponce;
import com.example.camundagradle.models.CustomResponseData;
import com.example.camundagradle.models.errorresponces.CustomErrorResponse;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.variable.VariableMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController(value = "/account")
public class AccountController {
    @Autowired
    private RuntimeService runtimeService;

    @PostMapping
    public ResponseEntity invokeCustomerCreationWorkFlow(@RequestBody CustomerDTO customerDTO){

        VariableMap variableMap = runtimeService.createProcessInstanceByKey("AccountOpen")
                                                .setVariable("customerDTO",customerDTO)
                                                .executeWithVariablesInReturn()
                                                .getVariables();

        //Check If Any Exceptions Occured During BPMN execution/////////////////////////////////////////////////////////
        ExceptionResponce exceptionResponce = (ExceptionResponce) variableMap.get("exceptionResponce");
        if(exceptionResponce != null)
            return new ResponseEntity<ExceptionResponce>(exceptionResponce, HttpStatus.valueOf(exceptionResponce.getStatus()));
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Check if Any Errors Occured During BPMN execution////////////////////////////////////////////////////////
        CustomErrorResponse customErrorResponce = (CustomErrorResponse) variableMap.get("customErrorResponce");
        if (customErrorResponce != null)
            return new ResponseEntity<CustomErrorResponse>(customErrorResponce, HttpStatus.valueOf(customErrorResponce.getStatus()));
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////


        //If no errors Occured During BPMN execution return data processed by BPMN//////////////////////////
        CustomResponseData customResponseData = (CustomResponseData) variableMap.get("customResponseData");
        return new ResponseEntity<CustomResponseData>(customResponseData, HttpStatus.valueOf(customResponseData.getStatus()));
        ////////////////////////////////////////////////////////////////////////////////////////////////////
    }


}
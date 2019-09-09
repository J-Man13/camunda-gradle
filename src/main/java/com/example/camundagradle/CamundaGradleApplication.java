package com.example.camundagradle;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication
public class CamundaGradleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CamundaGradleApplication.class, args);
    }

}

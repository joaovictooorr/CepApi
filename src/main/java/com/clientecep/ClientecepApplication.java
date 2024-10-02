package com.clientecep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ClientecepApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientecepApplication.class, args);
    }

}

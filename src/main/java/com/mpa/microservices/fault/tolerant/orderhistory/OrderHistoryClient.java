package com.mpa.microservices.fault.tolerant.orderhistory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderHistoryClient {

    public static void main(String[] args) {
        SpringApplication.run(OrderHistoryClient.class, args);
    }

}

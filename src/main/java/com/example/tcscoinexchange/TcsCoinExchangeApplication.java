package com.example.tcscoinexchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TcsCoinExchangeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TcsCoinExchangeApplication.class, args);
    }

}

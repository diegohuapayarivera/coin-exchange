package com.example.tcscoinexchange.infrastructure.client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "exchangeRateClient", url = "https://open.er-api.com/v6/latest")
public interface ExchangeRateClient {

    @GetMapping("/USD")
    ExchangeRateResponse getExchangeRates();

}



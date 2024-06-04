package com.example.tcscoinexchange.infrastructure.controller;

import com.example.tcscoinexchange.application.service.ExchangeService;
import com.example.tcscoinexchange.domain.model.ExchangeTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exchange")
public class ExchangeController {

    @Autowired
    private ExchangeService exchangeService;

    @PostMapping
    public ExchangeTransaction applyExchangeRate(@RequestParam double amount,
                                                 @RequestParam String sourceCurrency,
                                                 @RequestParam String targetCurrency) {
        return exchangeService.applyExchangeRate(amount, sourceCurrency, targetCurrency);
    }
}

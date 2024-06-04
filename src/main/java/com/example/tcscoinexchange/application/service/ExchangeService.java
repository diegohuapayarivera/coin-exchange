package com.example.tcscoinexchange.application.service;

import com.example.tcscoinexchange.domain.model.ExchangeTransaction;

public interface ExchangeService {
    ExchangeTransaction applyExchangeRate(double amount, String sourceCurrency, String targetCurrency);
}

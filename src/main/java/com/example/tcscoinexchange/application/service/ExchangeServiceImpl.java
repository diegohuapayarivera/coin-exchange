package com.example.tcscoinexchange.application.service;

import com.example.tcscoinexchange.domain.model.ExchangeTransaction;
import com.example.tcscoinexchange.domain.repository.ExchangeTransactionRepository;
import com.example.tcscoinexchange.infrastructure.client.ExchangeRateClient;
import com.example.tcscoinexchange.infrastructure.client.ExchangeRateResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ExchangeServiceImpl implements ExchangeService{

    private ExchangeRateClient exchangeRateClient;
    private ExchangeTransactionRepository repository;

    @Override
    public ExchangeTransaction applyExchangeRate(double amount, String sourceCurrency, String targetCurrency) {
        ExchangeRateResponse response = exchangeRateClient.getExchangeRates();
        double exchangeRate = response.getRates().get(targetCurrency);
        double exchangedAmount = amount * exchangeRate;

        ExchangeTransaction transaction = new ExchangeTransaction();
        transaction.setAmount(amount);
        transaction.setExchangedAmount(exchangedAmount);
        transaction.setSourceCurrency(sourceCurrency);
        transaction.setTargetCurrency(targetCurrency);
        transaction.setExchangeRate(exchangeRate);

        return repository.save(transaction);
    }
}

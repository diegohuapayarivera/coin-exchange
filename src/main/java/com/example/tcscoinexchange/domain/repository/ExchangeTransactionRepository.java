package com.example.tcscoinexchange.domain.repository;

import com.example.tcscoinexchange.domain.model.ExchangeTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeTransactionRepository extends JpaRepository<ExchangeTransaction, Long> {
}
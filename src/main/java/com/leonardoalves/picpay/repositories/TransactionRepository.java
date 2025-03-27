package com.leonardoalves.picpay.repositories;

import com.leonardoalves.picpay.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}

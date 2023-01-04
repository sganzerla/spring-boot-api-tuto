package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.entity.TransactionEntity;

public interface ITransactionRepository extends JpaRepository<TransactionEntity, Long> {
}

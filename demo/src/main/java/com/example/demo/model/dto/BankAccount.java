package com.example.demo.model.dto;

import lombok.Data;

import java.math.BigDecimal;

import com.example.demo.model.AccountStatus;
import com.example.demo.model.AccountType;

@Data
public class BankAccount {

    private Long id;
    private String number;
    private AccountType type;
    private AccountStatus status;
    private BigDecimal availableBalance;
    private BigDecimal actualBalance;
    private User user;

}

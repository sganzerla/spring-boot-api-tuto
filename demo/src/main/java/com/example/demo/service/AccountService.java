package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.dto.BankAccount;
import com.example.demo.model.dto.UtilityAccount;
import com.example.demo.model.entity.BankAccountEntity;
import com.example.demo.model.entity.UtilityAccountEntity;
import com.example.demo.model.mapper.BankAccountMapper;
import com.example.demo.model.mapper.UtilityAccountMapper;
import com.example.demo.repository.IBankAccountRepository;
import com.example.demo.repository.IUtilityAccountRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final BankAccountMapper bankAccountMapper = new BankAccountMapper();
    private final UtilityAccountMapper utilityAccountMapper = new UtilityAccountMapper();

    private final IBankAccountRepository bankAccountRepository;
    private final IUtilityAccountRepository utilityAccountRepository;

    public BankAccount readBankAccount(String accountNumber) {
        BankAccountEntity entity = bankAccountRepository.findByNumber(accountNumber).get();
        return bankAccountMapper.convertToDto(entity);
    }

    public UtilityAccount readUtilityAccount(String provider) {
        UtilityAccountEntity utilityAccountEntity = utilityAccountRepository.findByProviderName(provider).get();
        return utilityAccountMapper.convertToDto(utilityAccountEntity);
    }

    public UtilityAccount readUtilityAccount(Long id){
        return utilityAccountMapper.convertToDto(utilityAccountRepository.findById(id).get());
    }

}

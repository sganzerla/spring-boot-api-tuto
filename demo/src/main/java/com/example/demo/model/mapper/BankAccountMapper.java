package com.example.demo.model.mapper;

import com.example.demo.model.dto.BankAccount;
import com.example.demo.model.entity.BankAccountEntity;
import org.springframework.beans.BeanUtils;

public class BankAccountMapper extends BaseMapper<BankAccountEntity, BankAccount> {

    @Override
    public BankAccountEntity convertToEntity(BankAccount dto, Object... args) {
        BankAccountEntity entity = new BankAccountEntity();
        if (dto != null) {
            BeanUtils.copyProperties(dto, entity, "user");
        }
        return entity;
    }

    @Override
    public BankAccount convertToDto(BankAccountEntity entity, Object... args) {
        BankAccount dto = new BankAccount();
        if (entity != null) {
            BeanUtils.copyProperties(entity, dto, "user");
        }
        return dto;
    }
}
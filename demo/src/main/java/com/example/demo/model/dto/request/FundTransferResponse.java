package com.example.demo.model.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class FundTransferResponse {

    private String message;
    private String transactionId;

}
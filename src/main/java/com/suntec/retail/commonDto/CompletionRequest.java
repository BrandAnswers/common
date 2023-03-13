package com.suntec.retail.commonDto;

import lombok.Data;

@Data
public class CompletionRequest {

    private String prompt;

    private String model;

    private int max_tokens;
}

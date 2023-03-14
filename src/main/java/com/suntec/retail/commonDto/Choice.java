package com.suntec.retail.commonDto;

import lombok.Data;

@Data
public class Choice {

    private String text;

    private String index;

    private String logprobs;

    private String finish_reason;
}

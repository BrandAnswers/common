package com.suntec.retail.commonDto;


import lombok.Data;

@Data
public class Address {

    private String addressType;

    private String addressLine1;

    private String addressLine2;

    private String city;

    private String country;

    private String pinCode;

    private Boolean isPrimary;


}



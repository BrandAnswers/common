package com.suntec.retail.commonDto;



import com.suntec.retail.commonEnums.PhoneType;
import lombok.Data;


/**
 * {@link Phone}
 */

@Data
public class Phone {

    private PhoneType phoneType;

    private String countryCode;

    private String phone;

    private Boolean isPrimary;

}
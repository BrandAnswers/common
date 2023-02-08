package com.suntec.retail.commonDto;

import java.io.Serializable;

public class JwtResponseDto implements Serializable {

    private static final long serialVersionUID = -8091879091924046844L;
    private String jwttoken;
    private String entityId;

    public JwtResponseDto() {}

    public JwtResponseDto(String jwttoken, String entityId) {
        this.jwttoken = jwttoken;
        this.entityId = entityId;
    }

    public String getToken() {
        return this.jwttoken;
    }

    public String getEntityId() {
        return entityId;
    }
}
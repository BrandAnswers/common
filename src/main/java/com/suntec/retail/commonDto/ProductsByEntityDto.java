package com.suntec.retail.commonDto;

import com.suntec.retail.commonEnums.EntityType;
import lombok.Data;

@Data
public class ProductsByEntityDto {

    private String id;

    private String productId;

    private String entityId;

    private EntityType entityType;
}

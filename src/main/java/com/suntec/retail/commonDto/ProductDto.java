package com.suntec.retail.commonDto;

import com.suntec.retail.commonEnums.ProductStatus;
import lombok.Data;

import java.util.List;
import java.util.Objects;

@Data
public class ProductDto {

    private String productId;

    private String sku;

    private String productName;

    private String entityId;

    private String brandId;

    private String brandName;

    private String productDescription;

    private ProductStatus status;

    private String thumbnail;

    private String categoryName;

    private String parentCategoryName;

    private boolean isFeatured;

    private String basePrice;

    private List<String> availableRegions;

    private String currency;

    private String entityName;

    private String categoryId;

    private String parentCategoryId;

    private boolean isMaster;

    List<AdditionalAttributes> additionalAttributes;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductDto)) return false;
        ProductDto that = (ProductDto) o;
        return Objects.equals(productId, that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }

}

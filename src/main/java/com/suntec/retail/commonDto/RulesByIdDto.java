package com.suntec.retail.commonDto;

import com.suntec.retail.commonEnums.NotificationRequestType;
import com.suntec.retail.commonEnums.NotificationStatus;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
public class RulesByIdDto {

    private String ruleId;

    private String ruleName;

    private String ruleCode;

    private String className;

    private boolean isPlatformRule;

    private boolean  isEnabled;

    private String entityId;

    private String action;

    private String ruleEndpoint;

    private int ordinal;

    private Instant createdAt;

    private String createdBy;

}
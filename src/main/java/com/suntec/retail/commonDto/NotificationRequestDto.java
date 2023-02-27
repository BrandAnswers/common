package com.suntec.retail.commonDto;

import com.suntec.retail.commonEnums.EntityType;
import com.suntec.retail.commonEnums.NotificationRequestType;
import com.suntec.retail.commonEnums.NotificationStatus;
import lombok.Data;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class NotificationRequestDto {

    private String requestId;

    private String requesterUsername;

    private String requesterEntityId;

    private List<String> subscriberEntityId;

    private NotificationStatus notificationStatus;

    private NotificationRequestType notificationRequestType;

    private Object requestPayload;

    private String notificationMessage;

    private List<CommentDto> comments;

    private Instant createdAt;

    private Instant updatedAt;
}
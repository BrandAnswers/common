package com.suntec.retail.commonDto;

import lombok.Data;

import java.time.Instant;

@Data
public class CommentDto {
    String commentedBy;
    String comment;
    Instant createdAt;
}

package com.suntec.retail.commonDto;

import lombok.Data;

@Data
public class CommentDto {
    String commentedBy;
    String comment;
    Integer createdAt;
}

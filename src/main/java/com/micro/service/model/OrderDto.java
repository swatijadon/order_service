package com.micro.service.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder(toBuilder = true)
public class OrderDto {
    private String orderId;
    private String userId;
    private String orderName;
    private String orderNumber;
//   private long createdAt;
//    private long updatedAt;
}

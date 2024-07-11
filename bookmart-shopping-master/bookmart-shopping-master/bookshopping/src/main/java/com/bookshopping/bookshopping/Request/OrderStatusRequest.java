package com.bookshopping.bookshopping.Request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderStatusRequest {
    private Long orderId;
    private Long statusId;
}

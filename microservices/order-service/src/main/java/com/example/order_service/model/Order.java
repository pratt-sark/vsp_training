package com.example.order_service.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Long orderId;
    private Long userId;
    private String product;
    private double price;
    private User userDetails;  // This will hold user info fetched from UserService
}


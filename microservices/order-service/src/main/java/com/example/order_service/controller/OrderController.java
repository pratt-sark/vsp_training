package com.example.order_service.controller;

import com.example.order_service.feign.UserServiceClient;
import com.example.order_service.model.Order;
import com.example.order_service.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private UserServiceClient userServiceClient;

    @PostMapping
    public Order createOrder(@RequestParam Long userId, @RequestParam String product, @RequestParam double price) {
        User user = userServiceClient.getUserById(userId); // Fetch user details from UserService

        Order order = new Order();
        order.setOrderId(new Random().nextLong());
        order.setUserId(userId);
        order.setProduct(product);
        order.setPrice(price);
        order.setUserDetails(user); // Attach user details to order response

        return order;
    }
}


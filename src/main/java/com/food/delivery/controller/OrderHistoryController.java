
package com.food.delivery.controller;

import com.food.delivery.entity.OrderHistory;
import com.food.delivery.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order-history")
public class OrderHistoryController {
    @Autowired
    private OrderHistoryService orderHistoryService;

    @GetMapping("/{userId}")
    public List<OrderHistory> getAllOrderHistoriesByUserId(@PathVariable Long userId) {
        return orderHistoryService.getAllOrderHistoriesByUserId(userId);
    }

    @PostMapping("/")
    public OrderHistory addOrderHistory(@RequestParam Long userId, @RequestParam Long orderId, @RequestParam Double totalAmount) {
        return orderHistoryService.addOrderHistory(userId, orderId, totalAmount);
    }
}

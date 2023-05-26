
package com.food.delivery.service;

import com.food.delivery.entity.OrderHistory;
import com.food.delivery.repository.OrderHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderHistoryService {
    @Autowired
    private OrderHistoryRepository orderHistoryRepository;

    public List<OrderHistory> getAllOrderHistoriesByUserId(Long userId) {
        return orderHistoryRepository.findAllByUserId(userId);
    }

    public OrderHistory addOrderHistory(Long userId, Long orderId, Double totalAmount) {
        OrderHistory orderHistory = new OrderHistory();
        orderHistory.setUserId(userId);
        orderHistory.setOrderId(orderId);
        orderHistory.setOrderDate(new java.sql.Timestamp(System.currentTimeMillis()));
        orderHistory.setTotalAmount(totalAmount);
        return orderHistoryRepository.save(orderHistory);
    }
}

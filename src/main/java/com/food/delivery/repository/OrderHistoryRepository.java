
package com.food.delivery.repository;

import com.food.delivery.entity.OrderHistory;

import java.util.List;

public interface OrderHistoryRepository {
    List<OrderHistory> findAllByUserId(Long userId);
    OrderHistory save(OrderHistory orderHistory);
}

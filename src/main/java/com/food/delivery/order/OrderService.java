
package com.food.delivery.order;

public interface OrderService {
    Order placeOrder(Long userId, Long menuId, Integer quantity);
    Order getOrderById(Long id);
}

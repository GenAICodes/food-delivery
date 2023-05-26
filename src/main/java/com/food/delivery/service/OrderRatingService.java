
package com.food.delivery.service;

import com.food.delivery.rating.OrderRating;
import java.util.List;

public interface OrderRatingService {
    OrderRating addOrderRating(Long orderId, Integer rating, String review);
    List<OrderRating> getAllOrderRatingsByOrderId(Long orderId);
}

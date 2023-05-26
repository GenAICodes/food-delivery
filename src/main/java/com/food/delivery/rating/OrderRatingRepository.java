
package com.food.delivery.rating;

import java.util.List;

public interface OrderRatingRepository {
    List<OrderRating> findAllByOrderId(Long orderId);
    OrderRating save(OrderRating orderRating);
}

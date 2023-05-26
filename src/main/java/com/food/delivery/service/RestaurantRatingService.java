
package com.food.delivery.service;

import com.food.delivery.rating.RestaurantRating;
import java.util.List;

public interface RestaurantRatingService {
    RestaurantRating addRestaurantRating(Long restaurantId, Integer rating, String review);
    List<RestaurantRating> getAllRestaurantRatingsByRestaurantId(Long restaurantId);
}

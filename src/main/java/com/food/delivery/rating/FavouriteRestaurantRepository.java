
package com.food.delivery.rating;

import java.util.List;

public interface FavouriteRestaurantRepository {
    List<FavouriteRestaurant> findAllByUserId(Long userId);
}

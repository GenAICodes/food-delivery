
package com.food.delivery.service;

import com.food.delivery.rating.FavouriteRestaurant;

import java.util.List;

public interface FavouriteRestaurantService {
    FavouriteRestaurant addFavouriteRestaurant(Long userId, Long restaurantId);
    List<FavouriteRestaurant> getAllFavouriteRestaurantsByUserId(Long userId);
}

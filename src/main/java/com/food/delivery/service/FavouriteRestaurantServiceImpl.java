
package com.food.delivery.service;

import com.food.delivery.rating.FavouriteRestaurant;
import com.food.delivery.rating.FavouriteRestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavouriteRestaurantServiceImpl implements FavouriteRestaurantService {
    @Autowired
    private FavouriteRestaurantRepository favouriteRestaurantRepository;

    @Override
    public FavouriteRestaurant addFavouriteRestaurant(Long userId, Long restaurantId) {
        FavouriteRestaurant favouriteRestaurant = new FavouriteRestaurant(userId, restaurantId);
        return favouriteRestaurantRepository.save(favouriteRestaurant);
    }

    @Override
    public List<FavouriteRestaurant> getAllFavouriteRestaurantsByUserId(Long userId) {
        return favouriteRestaurantRepository.findAllByUserId(userId);
    }
}

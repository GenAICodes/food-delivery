
package com.food.delivery.service;

import com.food.delivery.rating.RestaurantRating;
import com.food.delivery.rating.RestaurantRatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantRatingServiceImpl implements RestaurantRatingService {
    @Autowired
    private RestaurantRatingRepository restaurantRatingRepository;

    @Override
    public RestaurantRating addRestaurantRating(Long restaurantId, Integer rating, String review) {
        RestaurantRating restaurantRating = new RestaurantRating(restaurantId, rating, review);
        return restaurantRatingRepository.save(restaurantRating);
    }

    @Override
    public List<RestaurantRating> getAllRestaurantRatingsByRestaurantId(Long restaurantId) {
        return restaurantRatingRepository.findAllByRestaurantId(restaurantId);
    }
}

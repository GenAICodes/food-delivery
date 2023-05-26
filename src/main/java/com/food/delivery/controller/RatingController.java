
package com.food.delivery.controller;

import com.food.delivery.rating.FavouriteRestaurant;
import com.food.delivery.service.FavouriteRestaurantService;
import com.food.delivery.rating.OrderRating;
import com.food.delivery.service.OrderRatingService;
import com.food.delivery.rating.RestaurantRating;
import com.food.delivery.service.RestaurantRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {
    @Autowired
    private OrderRatingService orderRatingService;

    @Autowired
    private RestaurantRatingService restaurantRatingService;

    @Autowired
    private FavouriteRestaurantService favouriteRestaurantService;

    @PostMapping("/order")
    public OrderRating addOrderRating(@RequestParam Long orderId, @RequestParam Integer rating, @RequestParam String review) {
        return orderRatingService.addOrderRating(orderId, rating, review);
    }

    @GetMapping("/order/{orderId}")
    public List<OrderRating> getAllOrderRatingsByOrderId(@PathVariable Long orderId) {
        return orderRatingService.getAllOrderRatingsByOrderId(orderId);
    }

    @PostMapping("/restaurant")
    public RestaurantRating addRestaurantRating(@RequestParam Long restaurantId, @RequestParam Integer rating, @RequestParam String review) {
        return restaurantRatingService.addRestaurantRating(restaurantId, rating, review);
    }

    @GetMapping("/restaurant/{restaurantId}")
    public List<RestaurantRating> getAllRestaurantRatingsByRestaurantId(@PathVariable Long restaurantId) {
        return restaurantRatingService.getAllRestaurantRatingsByRestaurantId(restaurantId);
    }

    @PostMapping("/favourite")
    public FavouriteRestaurant addFavouriteRestaurant(@RequestParam Long userId, @RequestParam Long restaurantId) {
        return favouriteRestaurantService.addFavouriteRestaurant(userId, restaurantId);
    }

    @GetMapping("/favourite/{userId}")
    public List<FavouriteRestaurant> getAllFavouriteRestaurantsByUserId(@PathVariable Long userId) {
        return favouriteRestaurantService.getAllFavouriteRestaurantsByUserId(userId);
    }
}

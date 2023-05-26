
package com.food.delivery.rating;

public class FavouriteRestaurant {
    private Long id;
    private Long userId;
    private Long restaurantId;

    public FavouriteRestaurant() {}

    public FavouriteRestaurant(Long userId, Long restaurantId) {
        this.userId = userId;
        this.restaurantId = restaurantId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }
}

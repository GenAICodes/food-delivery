
package com.food.delivery.rating;

public class RestaurantRating {
    private Long id;
    private Long restaurantId;
    private Integer rating;
    private String review;

    public RestaurantRating() {}

    public RestaurantRating(Long restaurantId, Integer rating, String review) {
        this.restaurantId = restaurantId;
        this.rating = rating;
        this.review = review;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}


package com.food.delivery.rating;

import java.sql.Timestamp;

public class OrderRating {
    private Long id;
    private Long orderId;
    private Integer rating;
    private String review;
    private Timestamp createdAt;

    public OrderRating(Long orderId, Integer rating, String review, Timestamp createdAt) {
        this.orderId = orderId;
        this.rating = rating;
        this.review = review;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}

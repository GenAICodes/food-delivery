
package com.food.delivery.service;

import com.food.delivery.rating.OrderRating;
import com.food.delivery.rating.OrderRatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderRatingServiceImpl implements OrderRatingService {
    @Autowired
    private OrderRatingRepository orderRatingRepository;

    @Override
    public OrderRating addOrderRating(Long orderId, Integer rating, String review) {
        OrderRating orderRating = new OrderRating(orderId, rating, review);
        return orderRatingRepository.save(orderRating);
    }

    @Override
    public List<OrderRating> getAllOrderRatingsByOrderId(Long orderId) {
        return orderRatingRepository.findAllByOrderId(orderId);
    }
}


package com.food.delivery.rating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FavouriteRestaurantRepositoryImpl implements FavouriteRestaurantRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<FavouriteRestaurant> findAllByUserId(Long userId) {
        String sql = "SELECT * FROM favourite_restaurant WHERE user_id = ?";
        return jdbcTemplate.query(sql, new Object[]{userId}, (rs, rowNum) ->
                new FavouriteRestaurant(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getLong("restaurant_id")
                )
        );
    }
}

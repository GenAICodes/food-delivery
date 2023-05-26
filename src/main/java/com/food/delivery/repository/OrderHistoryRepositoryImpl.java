
package com.food.delivery.repository;

import com.food.delivery.entity.OrderHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class OrderHistoryRepositoryImpl implements OrderHistoryRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<OrderHistory> findAllByUserId(Long userId) {
        String sql = "SELECT * FROM order_history WHERE user_id = ?";
        return jdbcTemplate.query(sql, new Object[]{userId}, (rs, rowNum) -> mapOrderHistory(rs));
    }

    @Override
    public OrderHistory save(OrderHistory orderHistory) {
        String sql = "INSERT INTO order_history (user_id, order_id, order_date, total_amount) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, orderHistory.getUserId(), orderHistory.getOrderId(), orderHistory.getOrderDate(), orderHistory.getTotalAmount());
        return orderHistory;
    }

    private OrderHistory mapOrderHistory(ResultSet rs) throws SQLException {
        OrderHistory orderHistory = new OrderHistory();
        orderHistory.setId(rs.getLong("id"));
        orderHistory.setUserId(rs.getLong("user_id"));
        orderHistory.setOrderId(rs.getLong("order_id"));
        orderHistory.setOrderDate(rs.getTimestamp("order_date"));
        orderHistory.setTotalAmount(rs.getDouble("total_amount"));
        return orderHistory;
    }
}


package com.food.delivery.reward;

public interface RewardPointsService {
    RewardPoints addRewardPoints(Long userId, Integer points);
    RewardPoints getRewardPointsByUserId(Long userId);
}

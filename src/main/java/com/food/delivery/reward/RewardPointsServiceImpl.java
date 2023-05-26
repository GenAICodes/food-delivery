
package com.food.delivery.reward;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RewardPointsServiceImpl implements RewardPointsService {
    @Autowired
    private RewardPointsRepository rewardPointsRepository;

    @Override
    public RewardPoints addRewardPoints(Long userId, Integer points) {
        RewardPoints rewardPoints = rewardPointsRepository.findByUserId(userId);
        if (rewardPoints == null) {
            rewardPoints = new RewardPoints(userId, points);
        } else {
            rewardPoints.setPoints(rewardPoints.getPoints() + points);
        }
        return rewardPointsRepository.save(rewardPoints);
    }

    @Override
    public RewardPoints getRewardPointsByUserId(Long userId) {
        return rewardPointsRepository.findByUserId(userId);
    }
}

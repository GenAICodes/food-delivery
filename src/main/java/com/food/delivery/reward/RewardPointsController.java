
package com.food.delivery.reward;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reward-points")
public class RewardPointsController {
    @Autowired
    private RewardPointsService rewardPointsService;

    @PostMapping
    public ResponseEntity<RewardPoints> addRewardPoints(@RequestBody RewardPoints rewardPoints) {
        RewardPoints addedRewardPoints = rewardPointsService.addRewardPoints(rewardPoints.getUserId(), rewardPoints.getPoints());
        return new ResponseEntity<>(addedRewardPoints, HttpStatus.CREATED);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<RewardPoints> getRewardPointsByUserId(@PathVariable Long userId) {
        RewardPoints rewardPoints = rewardPointsService.getRewardPointsByUserId(userId);
        if (rewardPoints != null) {
            return new ResponseEntity<>(rewardPoints, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

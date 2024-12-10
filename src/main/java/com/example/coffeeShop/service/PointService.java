package com.example.coffeeShop.service;

import com.example.coffeeShop.dto.PointRequest;
import com.example.coffeeShop.dto.PointResponse;
import com.example.coffeeShop.entity.User;
import com.example.coffeeShop.exception.ErrorCode;
import com.example.coffeeShop.exception.NotFoundException;
import com.example.coffeeShop.repository.PointRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PointService {
    private final PointRepository pointRepository;

    @Transactional
    public PointResponse chargePoint(PointRequest request) {
        User user = pointRepository.findById(request.getUserId())
                .orElseThrow(() -> new NotFoundException(ErrorCode.USER_NOT_FOUND));

        user.setPoints(user.getPoints() + request.getAmount());
        pointRepository.save(user);
        return new PointResponse(user.getId(), user.getPoints());
    }
}

package com.example.coffeeShop.controller;

import com.example.coffeeShop.dto.PointRequest;
import com.example.coffeeShop.dto.PointResponse;
import com.example.coffeeShop.service.PointService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/point")
@RequiredArgsConstructor
public class PointController {

    private final PointService pointService;

    /**
     * 포인트 충전하기
     * @param request
     * @return
     * @throws Exception
     */
    @PostMapping("/charge")
    public ResponseEntity<PointResponse> chargePoint(@RequestBody PointRequest request) throws Exception {
        PointResponse response = pointService.chargePoint(request);
        return ResponseEntity.ok(response);
    }
}

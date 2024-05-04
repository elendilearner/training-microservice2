package com.education.trainingmicroservice.controller;

import com.education.trainingmicroservice.dto.Status;
import com.education.trainingmicroservice.service.HealthCheckService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HealthCheckController {

    private final HealthCheckService healthCheckService;

    @GetMapping(value = "/health")
    public ResponseEntity<Status> healthCheck(){
        return ResponseEntity.ok(healthCheckService.getStatusOk());
    }
}

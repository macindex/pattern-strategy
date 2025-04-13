package com.hc.strategy.controller;

import com.hc.strategy.service.NotificationService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class NotificationController {
    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<Void> send(@RequestBody @Valid NotificationRequest request) {
        notificationService.notify(
                request.channel(),
                request.destination(),
                request.message()
        );

        return ResponseEntity.accepted().build();
    }
}

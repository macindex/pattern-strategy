package com.hc.strategy.service.strategy;

import com.hc.strategy.service.NotificationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmailNotificationStrategy implements NotificationStrategy {

    private final Logger logger = LoggerFactory.getLogger(EmailNotificationStrategy.class);

    @Override
    public void sendNotification(String destination, String message) {
        logger.info("Notificacao [{}] enviada para o Email [{}]", message, destination);
    }
}

package com.trupti;

import com.trupti.notification.NotificationService;

public class OrderService {
    NotificationService notification;

    public OrderService(NotificationService notification) {
        this.notification = notification;
    }

    public OrderService() {}

    public void setNotification(NotificationService notification) {
        this.notification = notification;
    }

    public void placeOrder() {
        System.out.println("Order placed!");
        notification.sendNotification();
    }
}

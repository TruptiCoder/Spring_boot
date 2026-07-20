package com.trupti;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

    // Now circular dependency is resolved
    private PaymentService paymentService = null;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.pay();

        // call here
        getOrderDetails();

        System.out.println("Order is placed");
    }

    public void getOrderDetails() {
        System.out.println("Order details");
    }
}

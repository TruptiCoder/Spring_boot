package com.trupti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    @Autowired
    private PaymentService paymentService = null;

//    public OrderService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void placeOrder() {
        paymentService.pay();
        System.out.println("Order is placed");
    }

    public void getOrderDetails() {
        System.out.println("Order details");
    }
}

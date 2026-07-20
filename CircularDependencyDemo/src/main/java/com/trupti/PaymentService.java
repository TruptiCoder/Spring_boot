package com.trupti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    @Autowired
    OrderService orderService = null;

//    public PaymentService(OrderService orderService) {
//        this.orderService = orderService;
//    }

    public void pay() {
        System.out.println("Payment done!");
        orderService.getOrderDetails();
    }
}

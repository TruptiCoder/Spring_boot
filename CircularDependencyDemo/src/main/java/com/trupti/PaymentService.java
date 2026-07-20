package com.trupti;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {

//    @Autowired
//    OrderService orderService = null;

//    public PaymentService(OrderService orderService) {
//        this.orderService = orderService;
//    }

    public void pay() {
        System.out.println("Payment done!");
        // Not its reponsibility
        // orderService.getOrderDetails();
    }
}

package com.trupti.config;

import com.trupti.User;
import com.trupti.payment.CardPayment;
import com.trupti.payment.PaymentService;
import com.trupti.payment.UpiPayment;
import com.trupti.service.OrderService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.trupti")
public class AppConfig {

    @Bean
    public User createUser() {
        return new User("Trupti", 20);
    }

    @Bean
    public PaymentService createCardPayment() {
        return new CardPayment();
    }

    @Bean
//    @Primary
    @Qualifier
    public PaymentService createUpiPayment() {
        return new UpiPayment();
    }

    @Bean
    @Qualifier
    public OrderService createOrderService(@Qualifier("createUpiPayment") PaymentService paymentService) {
        return new OrderService(paymentService);
    }
}

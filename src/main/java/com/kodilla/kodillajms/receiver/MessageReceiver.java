package com.kodilla.kodillajms.receiver;

import com.kodilla.kodillajms.domain.OrderDto;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

    @JmsListener(containerFactory = "jmsFactory", destination = "queue-test")
    public void receive(String message) {
        System.out.println("Received the message: " + message);
    }

    @JmsListener(containerFactory = "jmsFactory", destination = "orderQueue")
    public void receive1(OrderDto orderDto) {
        System.out.println("Received order with ID: " + orderDto.getId());
    }
}
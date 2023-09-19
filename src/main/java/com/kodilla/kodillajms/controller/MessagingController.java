package com.kodilla.kodillajms.controller;

import com.kodilla.kodillajms.domain.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/messages")
public class MessagingController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @GetMapping(path = "/process")
    public void processMessage(@RequestParam String message) {
        jmsTemplate.convertAndSend("queue-test", message);
    }

    @GetMapping(path = "/order")
    public void processMessage2(@RequestBody OrderDto orderDto) {
       jmsTemplate.convertAndSend("orderQueue", orderDto);
    }
}
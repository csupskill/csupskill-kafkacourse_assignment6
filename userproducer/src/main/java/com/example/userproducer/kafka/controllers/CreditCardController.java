package com.example.userproducer.kafka.controllers;

import com.example.userproducer.dto.CreditCard;
import com.example.userproducer.service.CreditCardProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditCardController {

    @Autowired
    CreditCardProducerService service;

    @PostMapping("/creditCard/")
    public void sendCreditCardData(CreditCard creditCard) {
        service.sendCreditCard(creditCard);
    }
}

package com.example.userconsumer.service;

import com.example.userconsumer.dto.CreditCard;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CreditCardConsumerService {

    @KafkaListener(topics = {"creditcard-topic"})
    public void consumeUserData(CreditCard card) {
        System.out.println("The name in the credit card is " + card.getFullName() + ", with number " + card.getCardNumber());
    }
}

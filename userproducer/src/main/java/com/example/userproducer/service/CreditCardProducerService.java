package com.example.userproducer.service;

import com.example.userproducer.dto.CreditCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CreditCardProducerService {
    @Autowired
    KafkaTemplate<String, CreditCard> kafkaTemplate;

    public void sendCreditCard(CreditCard card) {
        kafkaTemplate.send("creditcard-topic", card.getFullName(), card);
    }
}

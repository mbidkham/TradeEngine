package com.hoor.tradeengine.messagebroker.kafkaconsumer.service;

import com.hoor.tradeengine.messagebroker.kafkaconsumer.model.*;
import com.hoor.tradeengine.utils.JsonMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class KafkaConsumer {

    @PostConstruct
    public void loadJournalBeforeStartConsuming(){
        // todo : calculate from what offset start to load from kafka
        System.out.println("Start loading from a specific offset.");
    }

    @KafkaListener(topics = "my-topic")
    public void getMessage(String message){

        if (message.contains(CommandType.BALANCE.getValue())){
            System.out.println(JsonMapper.jsonStringToObject(message, UserBalanceCommand.class));
        }
        else if(message.contains(CommandType.USER.getValue())){
            System.out.println(JsonMapper.jsonStringToObject(message, UserCommand.class));
        }
        else if(message.contains(CommandType.SYMBOL.getValue())){
            System.out.println(JsonMapper.jsonStringToObject(message, SymbolIdCommand.class));
        }
        else if(message.contains(CommandType.ORDER.getValue())){
            System.out.println(JsonMapper.jsonStringToObject(message, OrderMessageCommand.class));
        }

    }
}

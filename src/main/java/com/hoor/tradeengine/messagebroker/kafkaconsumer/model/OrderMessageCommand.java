package com.hoor.tradeengine.messagebroker.kafkaconsumer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

@Data
public class OrderMessageCommand {
    private String timestamp;
    private OrderRequestType orderRequestType;
    private long uid;
    private long orderId;
    private String symbol;
    private long price;
    private long size;
    private Action action;
    private OrderType orderType;
    @JsonIgnore
    private String commandType;

    private Date getTimeStampAsDate(){
        return new Date(timestamp);
    }
}

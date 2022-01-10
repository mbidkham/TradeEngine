package com.hoor.tradeengine.messagebroker.kafkaconsumer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

@Data
public class UserBalanceCommand {

    private String timestamp;
    private int uid;
    private int currency;
    private long amount;
    private long transactionId;
    @JsonIgnore
    private String commandType;

    private Date getTimeStampAsDate(){
        return new Date(timestamp);
    }
}

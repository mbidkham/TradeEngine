package com.hoor.tradeengine.messagebroker.kafkaconsumer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

@Data
public class SymbolIdCommand {
    // todo : convert String to Date
    private String timestamp;
    private int symbolId;
    private SymbolType symbolType;
    private int baseCurrency;
    private int quoteCurrency;
    private long baseScaleK;
    private long quoteScaleK;
    private int takerFee;
    private int makerFee;
    @JsonIgnore
    private String commandType;

    private Date getTimeStampAsDate(){
        return new Date(timestamp);
    }
}

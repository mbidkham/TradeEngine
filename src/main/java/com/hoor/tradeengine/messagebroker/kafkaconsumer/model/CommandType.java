package com.hoor.tradeengine.messagebroker.kafkaconsumer.model;

public enum CommandType {

    BALANCE("Balance"),
    USER("User"),
    SYMBOL("Symbol"),
    ORDER("Order");

    private final String value;

    CommandType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

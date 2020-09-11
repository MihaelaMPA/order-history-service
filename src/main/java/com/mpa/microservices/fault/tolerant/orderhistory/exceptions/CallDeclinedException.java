package com.mpa.microservices.fault.tolerant.orderhistory.exceptions;

public class CallDeclinedException  extends RuntimeException{

    public CallDeclinedException(String message) {
        super(message);
    }
}

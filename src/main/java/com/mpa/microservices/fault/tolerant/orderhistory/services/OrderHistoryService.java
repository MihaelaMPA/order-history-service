package com.mpa.microservices.fault.tolerant.orderhistory.services;

import com.mpa.microservices.fault.tolerant.orderhistory.exceptions.CallDeclinedException;
import java.time.LocalTime;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class OrderHistoryService {

    private List<String> orderHistoryList = List.of("[Core Java Volume I – Fundamentals] - Cay S. Horstmann",
            "[Head First Java] - Kathy Sierra & Bert Bates",
            "[Modern Java in Action] - Raoul-Gabriel, Urma Mario, Fusco Alan Mycroft",
            "[Head First Object-Oriented Analysis Design] - Brett D. McLaughlin, Gary Pollice & David West");
    private static int counter = 1;

    public List<String> getOrderHistoryCB() {
        counter++;

        if (counter <= 5 || counter >= 8) {
            return orderHistoryList;
        } else {
            throw new CallDeclinedException("Something bad happened");
        }
    }

    public List<String> getOrderHistoryCBWithException() {
        throw new CallDeclinedException("Something bad has happened");
    }

    public List<String> getOrderHistoryRL() {
        System.out.println(LocalTime.now() + " request finished = " + Thread.currentThread().getName());
        return orderHistoryList;
    }
}

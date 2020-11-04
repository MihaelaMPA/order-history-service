package com.mpa.microservices.fault.tolerant.orderhistory.controllers;

import com.mpa.microservices.fault.tolerant.orderhistory.services.OrderHistoryService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderHistoryController {

    private OrderHistoryService orderHistoryService;

    public OrderHistoryController(OrderHistoryService orderHistoryService) {
        this.orderHistoryService = orderHistoryService;
    }

    @GetMapping("/ordersHistoryCB")
    public List<String> getOrdersForCB() {
        return orderHistoryService.getOrderHistoryCB();
    }

    @GetMapping("/exception")
    public List<String> getOrdersForCbWithException() {
        return orderHistoryService.getOrderHistoryCBWithException();
    }

    @GetMapping("/ordersHistoryRL")
    public List<String> getOrdersForRL() {
        return orderHistoryService.getOrderHistoryRL();
    }
}

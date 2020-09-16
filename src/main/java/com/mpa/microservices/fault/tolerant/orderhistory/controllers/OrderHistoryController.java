package com.mpa.microservices.fault.tolerant.orderhistory.controllers;

import com.mpa.microservices.fault.tolerant.orderhistory.services.OrderHistoryService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderHistoryController {

    private OrderHistoryService orderHistoryService;

    public OrderHistoryController(OrderHistoryService orderHistoryService) {
        this.orderHistoryService = orderHistoryService;
    }

    @GetMapping("/ordersHistoryCB/{id}")
    public List<String> getOrdersForCB(@PathVariable String id){
        return orderHistoryService.getOrderHistoryCB(id);
    }

    @GetMapping("/ordersHistoryRL")
    public List<String> getOrdersForRL(){
        return orderHistoryService.getOrderHistoryRL();
    }
 }

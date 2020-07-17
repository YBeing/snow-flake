package com.ybing.snowflake.controller;

import com.ybing.snowflake.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("/getidBysnowFlake")
    public String getidBysnowFlake(){
        String idBySnowFlake = orderService.getIdBySnowFlake();
        return "hello snowflake";
    }
}

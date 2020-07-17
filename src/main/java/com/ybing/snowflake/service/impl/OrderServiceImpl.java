package com.ybing.snowflake.service.impl;

import com.ybing.snowflake.service.OrderService;
import com.ybing.snowflake.util.IdGeneratorSnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private IdGeneratorSnowFlake idGeneratorSnowFlake;

    public String getIdBySnowFlake(){
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        for (int i = 0; i < 20; i++) {
            executorService.submit(()->{
                System.out.println(idGeneratorSnowFlake.snowflakedId());
            });
        }
        executorService.shutdown();
        return "hello snowflake";
    }
}

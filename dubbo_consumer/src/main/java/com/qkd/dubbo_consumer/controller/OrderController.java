package com.qkd.dubbo_consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qkd.dubbo_interface.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {
    @Autowired
    OrderService orderService;

    @ResponseBody
    @RequestMapping("/orderService")
    public String orderService(@RequestParam("uid") int id){
        System.out.println(id);
        return orderService.ShowOrder(id);
    }
}

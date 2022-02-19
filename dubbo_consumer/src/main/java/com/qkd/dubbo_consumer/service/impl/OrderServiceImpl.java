package com.qkd.dubbo_consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qkd.dubbo_interface.pojo.User;
import com.qkd.dubbo_interface.service.OrderService;
import com.qkd.dubbo_interface.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    UserService userService;
    @Override
    public String ShowOrder(int id) {
        User user = userService.SelectUserById(id);
        int uid = user.getId();
        String name = user.getName();
        return "用户单号："+uid+" 用户姓名："+name;
    }
}

package com.qkd.dubbo_provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qkd.dubbo_interface.pojo.User;
import com.qkd.dubbo_interface.service.UserService;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserServiceImpl implements UserService {

    @Override
    public User SelectUserById(int id) {
        User user = new User();
        user.setId(1);
        user.setName("zhangsan");
        return user;
    }
}

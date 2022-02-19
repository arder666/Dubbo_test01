package com.qkd.dubbo_interface.service;

import com.qkd.dubbo_interface.pojo.User;

public interface UserService{
    User SelectUserById(int id);
}

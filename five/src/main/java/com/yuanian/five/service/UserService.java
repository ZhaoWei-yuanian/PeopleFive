package com.yuanian.five.service;

import com.yuanian.five.model.User;

import java.util.List;

public interface UserService {
    int insert(User user);

    User selectByPrimaryKey(String usercode);


}

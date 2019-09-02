package com.yuanian.five.service;

import com.yuanian.five.dao.UserMapper;
import com.yuanian.five.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：mmzs
 * @date ：Created in 2019/8/30 10:04
 * @description：
 * @modified By：
 * @version: $
 */
@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insert(User user){
        return userMapper.insert(user);
    }

    @Override
    public User selectByPrimaryKey(String usercode){
        return userMapper.selectByPrimaryKey(usercode);
    }


}

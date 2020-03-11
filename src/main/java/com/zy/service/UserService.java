package com.zy.service;

import com.zy.mapper.UserMapper;
import com.zy.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserMapper userMapper; //可能会提示没有对应的bean，不用管

    @Autowired
    private RedisTemplate redisTemplate;


    public User queryById(Long id){ //根据id查询
        return userMapper.selectByPrimaryKey(id);
    }
}

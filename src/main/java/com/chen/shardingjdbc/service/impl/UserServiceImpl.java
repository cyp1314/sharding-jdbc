package com.chen.shardingjdbc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chen.shardingjdbc.entity.User;
import com.chen.shardingjdbc.mapper.UserMapper;
import com.chen.shardingjdbc.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Mr-CHEN
 * @version 1.0
 * @description: TODO
 * @date 2021-01-20 10:49
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}

package com.chen.shardingjdbc;

import com.chen.shardingjdbc.entity.User;
import com.chen.shardingjdbc.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ShardingJdbcApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testDataSource() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

}

package com.buyi.mappers;

import com.buyi.entity.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserMapperTest {

    private static UserMapper userMapper;

    @Before
    public void setUp() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        userMapper = context.getBean(UserMapper.class);
    }

    @Test
    public void queryUser() {
        User user = userMapper.queryUser(1);
        System.out.println(user.getName());
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setName("buyi");
        user.setEmail("sefawefawe@qq.com");
        user.setPsw("123");
        userMapper.addUser(user);
        System.out.println();
    }

    @Test
    public void updateUser() {
        User user = userMapper.queryUser(1);
        System.out.println(user.getPsw());
        user.setPsw("456");
        userMapper.updateUser(user);
        System.out.println(userMapper.queryUser(1).getPsw());

    }

    @Test
    public void delUser() {
        userMapper.delUser(1);
    }

    @Test
    public void disUser() {
        userMapper.disUser(1);
    }

    @Test
    public void queryByEmail() {
        User user = userMapper.queryByEmail("sefawefawe@qq.com");
        System.out.println(user);

    }
}
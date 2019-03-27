package com.buyi.service.impl;

import com.buyi.dto.request.LoginRequest;
import com.buyi.dto.request.RegisterRequest;
import com.buyi.entity.User;
import com.buyi.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserServiceImplTest {
    private UserService userService;

    @Before
    public void setUp() {
        userService = (UserService) new ClassPathXmlApplicationContext("application-context.xml")
                .getBean("userServiceImpl");
    }

    @Test
    public void register() {
        RegisterRequest request = new RegisterRequest();
        request.setEmail("2769099689@qq.com");
        request.setName("buyi");
        request.setPsw("123456");
        userService.register(request);
    }

    @Test
    public void login() {
        LoginRequest login = new LoginRequest();
        login.setEmail("2769099689@qq.com");
        login.setPsw("123456");
        userService.login(login);

    }

    @Test
    public void queryOneById() {
        User user = userService.queryOneById(1);
        if (null == user) {
            System.out.println("query user is failed! ");
        } else {
            System.out.println("query user is success: ");
        }
    }
}
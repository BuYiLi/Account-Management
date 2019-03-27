package com.buyi.service;

import com.buyi.common.exception.GlobalException;
import com.buyi.dto.request.LoginRequest;
import com.buyi.dto.request.RegisterRequest;
import com.buyi.entity.User;

public interface UserService {

    void register(RegisterRequest req)throws GlobalException;

    String login(LoginRequest req) throws GlobalException;

    User queryOneById(Integer id)throws GlobalException;


}

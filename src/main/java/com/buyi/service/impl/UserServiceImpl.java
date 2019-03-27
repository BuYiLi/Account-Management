package com.buyi.service.impl;

import com.buyi.common.exception.GlobalException;
import com.buyi.common.utils.TokenUtil;
import com.buyi.constant.ResponseStatusEnum;
import com.buyi.dto.request.LoginRequest;
import com.buyi.dto.request.RegisterRequest;
import com.buyi.entity.User;
import com.buyi.mappers.UserMapper;
import com.buyi.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public void register(RegisterRequest req) throws GlobalException {
        User user = userMapper.queryByEmail(req.getEmail());
        if(null != user){
            throw new GlobalException("该邮箱已被注册!",ResponseStatusEnum.CLIENT_FAILED_PARAMETER.getCode());
        }
        user = new User();
        BeanUtils.copyProperties(req,user);
        userMapper.addUser(user);
    }

    @Override
    public String login(LoginRequest req) throws GlobalException {
        User user = userMapper.queryByEmail(req.getEmail());
        if (null == user || !user.getPsw().equals(req.getPsw())) {
            throw new GlobalException("邮箱或密码错误！", ResponseStatusEnum.CLIENT_FAILED_PARAMETER.getCode());
        }
        return TokenUtil.createJWS(user.getId(), user.getName());
    }

    @Override
    public User queryOneById(Integer id) throws GlobalException {
        if(null == id){
            throw new GlobalException(ResponseStatusEnum.CLIENT_FAILED_PARAMETER.getMsg(),
                    ResponseStatusEnum.CLIENT_FAILED_PARAMETER.getCode());
        }
        User user = userMapper.queryUser(id);
        return user;
    }
}

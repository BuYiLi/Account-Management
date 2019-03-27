package com.buyi.mappers;

import com.buyi.entity.User;

public interface UserMapper {

    User queryUser(Integer id);

    User queryByEmail(String email);

    void addUser(User user);

    void updateUser(User user);

    void delUser(Integer id);

    void disUser(Integer id);
}

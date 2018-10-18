package com.buyi.mappers;

import com.buyi.entity.Account;

public interface AccountMapper {

    Account queryAccount(Integer id);

    void addAccount(Account account);

    void updateAccount(Account account);

    void delAccount(Integer id);

    void disAccount(Integer id);

}

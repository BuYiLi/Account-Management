package com.buyi.mappers;

import com.buyi.entity.Account;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountMapperTest {

    private AccountMapper accountMapper;

    @Before
    public void setUp() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        accountMapper = context.getBean(AccountMapper.class);
        System.out.println();
    }

    @Test
    public void queryAccount() {
        Account account = accountMapper.queryAccount(1);
        System.out.println(account.getNickname());
    }

    @Test
    public void addAccount() {
        Account account = new Account();
        account.setaId("234253452352");
        account.setEmail("awefawe@aesfawe");
        account.setDescription("fawefaw");

        accountMapper.addAccount(account);
        System.out.println();

    }

    @Test
    public void updateAccount() {
        Account account = accountMapper.queryAccount(1);
        System.out.println(account.getNickname());

        account.setNickname("updated ");
        accountMapper.updateAccount(account);

        Account updatedAccount = accountMapper.queryAccount(1);
        System.out.println(updatedAccount.getNickname());

    }

    @Test
    public void delAccount() {
        Account account = accountMapper.queryAccount(1);
        System.out.println(account.getNickname());

        accountMapper.delAccount(1);
        Account delAccount = accountMapper.queryAccount(1);
        System.out.println("delete account : " + (null == delAccount));

    }

    @Test
    public void disAccount() {

        Account account = accountMapper.queryAccount(2);
        System.out.println(account.getNickname());

        accountMapper.disAccount(2);
        Account disabledAccount = accountMapper.queryAccount(2);

        System.out.println("disabled account : " + (null == disabledAccount));
    }
}
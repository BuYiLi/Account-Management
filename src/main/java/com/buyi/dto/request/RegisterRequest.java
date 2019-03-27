package com.buyi.dto.request;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class RegisterRequest implements Serializable {

    @NotNull(message = "用户名不能为空!")
    private String name;

    @NotNull(message = "邮箱不能为空!")
    private String email;

    @NotNull(message = "密码不能为空!")
    private String psw;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }


}

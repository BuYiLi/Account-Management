package com.buyi.entity;

public class User extends CommonFiled {

    private Integer disFlag;
    private String name;
    private String email;
    private String psw;

    public Integer getDisFlag() {
        return disFlag;
    }

    public void setDisFlag(Integer disFlag) {
        this.disFlag = disFlag;
    }

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

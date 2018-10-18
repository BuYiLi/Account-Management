package com.buyi.constant;

public enum DeleteFlagEnum {
    DELETE(2), NORMAL(1);
    private int flag;

    public int getflag() {
        return flag;
    }

    DeleteFlagEnum(int flag) {
        this.flag = flag;
    }
}

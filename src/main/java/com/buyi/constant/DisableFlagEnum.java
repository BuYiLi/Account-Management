package com.buyi.constant;

public enum DisableFlagEnum {
    DISABLE(2),ENABLE(1);

    private int flag;

    public int getflag() {
        return flag;
    }

    DisableFlagEnum(int flag) {
        this.flag = flag;
    }
}

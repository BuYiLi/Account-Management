package com.buyi.entity;

import java.io.Serializable;
import java.util.Date;

public class Common implements Serializable {

    private Integer id;

    private Date cTime;

    private Integer delFlag;

    private Integer disFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public Integer getDisFlag() {
        return disFlag;
    }

    public void setDisFlag(Integer disFlag) {
        this.disFlag = disFlag;
    }
}

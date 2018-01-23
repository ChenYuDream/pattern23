package com.chenyu;

import java.util.Date;

/**
 * shallow clone
 * 克隆羊  多利
 *
 * @author yu_chen
 * @create 2018-01-23 17:55
 **/
public class Sheep implements Cloneable {

    private String name;
    private Date birthDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

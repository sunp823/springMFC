package com.mkyong.common;

import com.sun.org.apache.regexp.internal.REUtil;
import org.springframework.stereotype.Component;

/**
 * Created by hzsunpeng on 2016/5/27.
 */
public class Person {
    private String name;
    private String address;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "[name:"+getName()+
                ",address:" + getAddress()+
                ",age:" +getAge()+
                "]";
    }
}

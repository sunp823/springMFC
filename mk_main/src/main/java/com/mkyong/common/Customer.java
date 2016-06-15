package com.mkyong.common;

import com.mkyong.common.DAO.PersonTest;
import com.mkyong.common.DAO.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.naming.Name;
import javax.security.auth.login.FailedLoginException;

/**
 * Created by hzsunpeng on 2016/5/27.
 */
public class Customer
{
    @Autowired()
    private Person person;

    @Autowired
    private PersonTest personTest;

    private int type;
    private String action;

    @Autowired
    @Qualifier("okservice")
    private UserDAO userDAO;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    //getter and setter method


    @Override
    public String toString() {
        return "[Type:"+getType()+
                ",action:"+getAction()+
                ","+"personTest:"+
                personTest.toString()+"]"+
                ","+"person:"+
                person.toString()

                +
                userDAO.str();
    }
}
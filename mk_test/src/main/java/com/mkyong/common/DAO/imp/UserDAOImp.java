package com.mkyong.common.DAO.imp;

import com.mkyong.common.DAO.UserDAO;
import org.springframework.stereotype.Service;

/**
 * Created by hzsunpeng on 2016/5/28.
 */
@Service("okservice")
public class UserDAOImp implements UserDAO{

    public String str() {
        return "ok";
    }
}

package com.edu.nju.wel.dao;

import com.edu.nju.wel.util.ApplicationContextHelper;
import org.springframework.context.ApplicationContext;

/**
 * Created by Jerry Wang on 2016/12/30.
 */
public class DAOManager {

    public final static UserDao userDao;
    public final static GoodDao goodDao;


    static {
        ApplicationContext context = ApplicationContextHelper.getApplicationContext();
        userDao = context.getBean(UserDao.class);
        goodDao = context.getBean(GoodDao.class);
    }

}

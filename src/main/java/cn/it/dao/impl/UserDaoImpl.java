package cn.it.dao.impl;

import cn.it.UserService;
import cn.it.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("userDao1")//标记在Dao层
public class UserDaoImpl implements UserDao {

    public void show() {
        System.out.println("开车了..............嘟嘟嘟嘟嘟嘟.......");
    }

}

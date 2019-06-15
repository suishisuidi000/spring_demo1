package cn.it.impl;

import cn.it.UserService;
import cn.it.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("service")//在service层实例化bean
public class UserServiceImpl implements UserService {
    @Autowired//根据类型注入
    //@Qualifier("userDao")//按照名称进行注入
   //@Resource
   private UserDao dao;
   /* public void setDao(UserDao dao) {
        this.dao = dao;
    }*/

    public void save() {
        dao.show();
    }
}

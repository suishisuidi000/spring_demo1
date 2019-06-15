package cn.it.web;

import cn.it.UserService;
import cn.it.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class con_text {

    public static void main(String[] args) {

        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService bean = app.getBean(UserService.class);
        bean.save();



    }
}

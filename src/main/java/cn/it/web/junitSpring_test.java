package cn.it.web;

import cn.it.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)//使用Spring中的测试类进行单元测试
//@ContextConfiguration(classes = {SpringConfigContext.class})//加载外部文件/外部类
@ContextConfiguration("classpath:applicationContext.xml")
public class junitSpring_test {

@Autowired
private UserService userService;
@Autowired
private DataSource dataSource;

@Test
public void test1() throws SQLException {
    userService.save();
    System.out.println(dataSource.getConnection());
}

}

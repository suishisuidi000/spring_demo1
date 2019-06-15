package cn.it.web;

import cn.it.UserService;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.util.ResourceBundle;

public class con_app {

   @Test
    public void show() throws Exception {
       ComboPooledDataSource cpd = new ComboPooledDataSource();
       cpd.setDriverClass("com.mysql.jdbc.Driver");
       cpd.setJdbcUrl("jdbc:mysql://localhost:3306/test");
       cpd.setUser("root");
       cpd.setPassword("984683");
       Connection connection = cpd.getConnection();
       System.out.println(connection);
       connection.close();
   }
    @Test
    public void show02() throws Exception {
        DruidDataSource dds = new DruidDataSource();
        dds.setDriverClassName("com.mysql.jdbc.Driver");
        dds.setUrl("jdbc:mysql://localhost:3306/test");
        dds.setUsername("root");
        dds.setPassword("984683");
        DruidPooledConnection connection = dds.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    public void show3() throws Exception {
        ResourceBundle reb = ResourceBundle.getBundle("jdbc");
        String driver = reb.getString("jdbc.driver");
        String url = reb.getString("jdbc.url");
        String username = reb.getString("jdbc.username");
        String password = reb.getString("jdbc.password");

        DruidDataSource dds = new DruidDataSource();
        dds.setDriverClassName(driver);
        dds.setUrl(url);
        dds.setUsername(username);
        dds.setPassword(password);
        DruidPooledConnection connection = dds.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    public void show4() throws Exception {

        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        DruidDataSource dds = app.getBean(DruidDataSource.class);
        DruidPooledConnection connection = dds.getConnection();
        System.out.println(connection);
       connection.close();
    }
}

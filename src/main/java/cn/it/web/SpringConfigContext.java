package cn.it.web;

import com.alibaba.druid.pool.DruidDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration//指定Spring配置类
@ComponentScan("cn.it")//组件扫描
@PropertySource("classpath:jdbc.properties")//加载配置文件
public class SpringConfigContext {

    @Value("${jdbc.driver}")//通过配置文件的key值获取value值
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean("DataSource")//将该方法的返回值添加到spring容器中
    public DataSource getDataSource() throws PropertyVetoException {
        ComboPooledDataSource cpd = new ComboPooledDataSource();
        cpd.setDriverClass(driver);
        cpd.setJdbcUrl(url);
        cpd.setUser(username);
        cpd.setPassword(password);
        return cpd;

    }
}

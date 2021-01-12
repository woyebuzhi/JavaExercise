package indi.Test.jdbc;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionTest {


    //连接方式1
    @Test
    public void testConnetion1() throws SQLException {
       Driver driver = new com.mysql.jdbc.Driver();

       String url = "jdbc:mysql://192.168.5.5:3306/mysql";
       Properties info = new Properties();
       info.setProperty("user", "root");
       info.setProperty("password", "123456");

       Connection conn = driver.connect(url,info);
       System.out.println(conn);
    }



    //方式2：
    @Test
    public void testConnetion2() throws Exception {
        Class clazz = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver)clazz.newInstance();


        String url = "jdbc:mysql://192.168.5.5:3306/mysql";
        Properties info = new Properties();
        info.setProperty("user", "root");
        info.setProperty("password", "123456");

        Connection conn = driver.connect(url,info);
        System.out.println(conn);

    }

    @Test
    public void testConnetion3() throws Exception {
        Class clazz = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) clazz.newInstance();

        String url = "jdbc:mysql://192.168.5.5:3306/mysql";
        String user = "root";
        String password = "123456";

        DriverManager.registerDriver(driver);
        Connection conn = DriverManager.getConnection(url,user,password);
        System.out.println(conn);
    }

    @Test
    public void testConnetion4() throws Exception {
        InputStream is = ConnectionTest.class.getClassLoader().getResourceAsStream("resoutces/jdbc.properties");

        Properties pros = new Properties();
        pros.load(is);

        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        String url = pros.getProperty("url");
        String driverClass = pros.getProperty("driverClass");

        //2.加载驱动
        Class.forName(driverClass);

        //3.获取连接
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println(conn);

    }













}

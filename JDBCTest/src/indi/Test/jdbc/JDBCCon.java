package indi.Test.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCCon {

    public static void main(String[] args) throws SQLException {
        try{
            Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);

            String url = "jdbc:mysql://192.168.5.57:3306/xjw";
            String user = "root";
            String pwd = "123456";

            Connection con = DriverManager.getConnection(url,user,pwd);
            System.out.println(con);


        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}

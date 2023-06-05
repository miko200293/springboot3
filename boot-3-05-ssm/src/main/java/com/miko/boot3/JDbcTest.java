package com.miko.boot3;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDbcTest {
    @Test
    public void jdbcall() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");//加载驱动类
        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "155936";
        Connection conn = DriverManager.getConnection(url, username, password);//用参数得到连接对象
        System.out.println("连接成功！");
        System.out.println(conn);
    }
}


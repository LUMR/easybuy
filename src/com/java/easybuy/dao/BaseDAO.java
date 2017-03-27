package com.java.easybuy.dao;

import com.java.easybuy.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**基础数据库
 * Created by fsweb on 17-3-27.
 */
public class BaseDAO {
    private Connection conn;
    public Connection getConn(){
        String url = "jdbc:mysql://localhost:3306/bbs";
        String urlDefault = "?characterEncoding=utf8&useSSL=true";
        String name = "webuser";
        String password = "wwwlumr";
        try {
            //指定数据库驱动
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();//打印驱动
            System.out.println("找不到数据库驱动");
        }
        try {
            conn = DriverManager.getConnection(url+urlDefault,name,password);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("数据库连接失败，改用远程连接。");
        }
        return conn;
    }
}

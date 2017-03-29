package com.java.easybuy.dao;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.*;

/**
 * 基础数据库
 * Created by fsweb on 17-3-27.
 */
public class BaseDAO {
    protected Connection conn;
    protected PreparedStatement ps;
    protected ResultSet rs;

    /**
     * @return 返回一个连接
     * @deprecated 不建议用
     */
    @Deprecated
    public Connection getConn() {
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
            conn = DriverManager.getConnection(url + urlDefault, name, password);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("数据库连接失败，改用远程连接。");
        }
        return conn;
    }

    /**
     * 使用连接池连接数据库
     * @return 返回一个数据库连接的引用
     */
    public Connection getConnection() {
        try {
            Context context = new InitialContext();
            DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/easybuy");
            conn = dataSource.getConnection();
        } catch (NamingException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * prepareStatement的executeUpdate方法
     * @param sql sql中的?必须与obj[]数组的顺序对应
     * @param obj 参数数组
     * @return 返回值>0表示更新成功,0表示失败,-1表示数据库错误
     */
    public int preUpdate(String sql,Object[] obj){
        int result = 0;
        conn = getConnection();
        try {
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < obj.length; i++) {
                ps.setObject(i+1,obj[i]);
            }
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            result = -1;
        }finally {
            closeAll();
        }
        return result;
    }

    /**
     * prepareStatement的executeQuery方法,使用此方法记得手动调用closeAll关闭数据库连接
     * @param sql 同上
     * @param obj 同上
     * @return 返回ResultSet,不会自动关闭conn连接，必须手动关闭
     */
    public ResultSet preQuery(String sql,Object[] obj){
        conn = getConnection();
        try {
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < obj.length; i++) {
                ps.setObject(i+1,obj[i]);
            }
            rs = ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    /**
     * 关闭所有连接
     */
    public void closeAll() {

        try {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}

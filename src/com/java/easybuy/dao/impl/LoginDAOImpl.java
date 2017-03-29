package com.java.easybuy.dao.impl;

import com.java.easybuy.dao.BaseDAO;
import com.java.easybuy.dao.LoginDao;
import com.java.easybuy.vo.User;

import java.sql.SQLException;

/**
 * Created by fsweb on 17-3-29.
 */
public class LoginDAOImpl extends BaseDAO implements LoginDao{
    public int liginName(User user) {// 根据登录名查询是否存在，存在返回0，不存在返回1
        conn = getConnection(); // 调用连接数据库方法
        int i=0;
        String sql = "select password from easybuy_user where loginName=? ";
        try {
            ps = conn.prepareStatement(sql);

            ps.setString(1, user.getLoginName());
            rs = ps.executeQuery();

            if (rs.next()) {
                user.setPassword(rs.getString("password"));
            } else {
                i=1;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally {
            closeAll();
        }
        return i;
    }
}

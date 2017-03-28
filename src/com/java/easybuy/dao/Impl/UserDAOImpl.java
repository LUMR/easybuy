package com.java.easybuy.dao.Impl;

import com.java.easybuy.dao.BaseDAO;
import com.java.easybuy.dao.UserDAO;
import com.java.easybuy.vo.User;

import java.sql.SQLException;

/**
 * user impl
 * Created by fsweb on 17-3-28.
 */
public class UserDAOImpl extends BaseDAO implements UserDAO {
    @Override
    public int selectUser(String username) {
        return 0;
    }

    @Override
    public User getUser(int id) {
        String sql = "select * from easybuy_user where id = ?";
        User user = null;
        conn = getConnection();
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            if (rs.next()){
                user = new User(rs.getString("userName"),rs.getString("password"),
                        rs.getString("sex"),rs.getString("email"),
                        rs.getString("mobile"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll();
        }
        return user;
    }

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

}

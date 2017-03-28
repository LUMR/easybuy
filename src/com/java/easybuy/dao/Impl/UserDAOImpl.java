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
        return updateUser(null);
    }

    @Override
    public int checkPassword(User user) {
        return updateUser(null);
    }

    @Override
    public void getUserInfo(User user) {
        if (user != null && user.getLoginName() != null) {
            String sql = "select * from easybuy_user where LoginName = ?";
            Object[] obj = new Object[]{user.getLoginName()};
            rs = preQuery(sql, obj);
            try {
                if (rs.next()) {
                    user.setId(rs.getInt("id"));
                    user.setUserName(rs.getString("userName"));
                    user.setSex(rs.getString("sex"));
                    user.setEmail(rs.getString("email"));
                    user.setIdentityCode(rs.getString("identityCode"));
                    user.setType(rs.getInt("type"));
                    user.setMobile(rs.getString("mobile"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int addUser(User user) {
        String sql = "insert into easybuy_user(loginName,userName,password,sex,type) " +
                "values(?,?,?,?,1)";
        Object[] obj = new Object[]{user.getLoginName(), user.getUserName(), user.getPassword(), user.getSex()};
        return preUpdate(sql, obj);
    }

    @Override
    public int updateUser(User user) {
        String sql = "update easybuy_user " +
                "set loginName=?, userName=?, password = ?, sex=?, " +
                "identityCode=?, email=?, mobile=? where id = ?";
        Object[] obj = new Object[]{user.getLoginName(), user.getUserName(), user.getPassword(),
                user.getSex(), user.getIdentityCode(), user.getEmail(), user.getMobile(), user.getId()};
        return preUpdate(sql, obj);
    }

}

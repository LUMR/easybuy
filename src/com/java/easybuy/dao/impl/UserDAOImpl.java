package com.java.easybuy.dao.impl;

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
    public int selectUser(User user) {
        String sql = "select password from easybuy_user where loginName = ?";
        conn = getConnection();
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,user.getLoginName());
            rs = ps.executeQuery();
            if (rs.next())
                return 1;
            else
                return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
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
                if (rs!=null&&rs.next()) {
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
        String sql = "insert into easybuy_user(loginName,password,email,mobile,type) " +
                "values(?,?,?,?,1)";
        Object[] obj = new Object[]{user.getLoginName(), user.getPassword(),user.getEmail(), user.getMobile()};
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

	@Override
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



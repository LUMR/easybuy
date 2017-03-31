package com.java.easybuy.dao.impl;

import com.java.easybuy.dao.BaseDAO;
import com.java.easybuy.dao.NewsDao;
import com.java.easybuy.vo.News;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fsweb on 17-3-30.
 */
public class NewsDaoImpl extends BaseDAO implements NewsDao {
    @Override
    public List<News> getAllNews(int pageIndex, int pageSize) {
        String sql = "select * from easybuy_news order by createTime desc limit ?,?";
        Object[] obj = new Object[]{pageIndex,pageSize};
        List<News> list = new ArrayList<>();
        try {
            rs = preQuery(sql,obj);
            while (rs.next()){
                News news = new News(rs.getInt("id"), rs.getString("title"), rs.getString("content"), rs.getDate("createTime"));
                list.add(news);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll();
        }
        return list;
    }

    @Override
    public News getById(int id) {
        return null;
    }

    @Override
    public void add(News news) {

    }

    @Override
    public void update(News n) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public int getCount() {
        return 0;
    }
}

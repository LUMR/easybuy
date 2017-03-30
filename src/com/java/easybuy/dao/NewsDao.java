package com.java.easybuy.dao;

import com.java.easybuy.vo.News;

import java.util.List;

public interface NewsDao {
    //获取所有新闻
    List<News> getAllNews(int pageIndex, int pageSize);

    //根据编号获取新闻
    News getById(int id);

    //新增
    void add(News news);

    //更新新闻
    void update(News n);

    //删除新闻
    void delete(int id);

    //获得总的数量
    int getCount();

}

package com.java.easybuy.dao;

import java.util.List;

import com.java.easybuy.vo.News;

public interface NewsDao {
	//获取所有新闻
	public List<News> getAllNews(int pageIndex, int pageSize);
	//根据编号获取新闻
	public News getById(int id);
	//新增
	public void add(News news);
	//更新新闻
	public void update(News n);
	//删除新闻
	public void delete(int id);
	//获得总的数量
	public int getCount();
	
}

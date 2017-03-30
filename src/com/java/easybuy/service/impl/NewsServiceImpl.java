package com.java.easybuy.service.impl;

import com.java.easybuy.dao.NewsDao;
import com.java.easybuy.dao.impl.NewsDaoImpl;
import com.java.easybuy.service.NewsService;
import com.java.easybuy.vo.News;

import java.util.List;

/**
 * Created by fsweb on 17-3-30.
 */
public class NewsServiceImpl implements NewsService {

    @Override
    public List<News> getAllNews() {
        NewsDao newsDao = new NewsDaoImpl();
        return newsDao.getAllNews(0,5);
    }
}

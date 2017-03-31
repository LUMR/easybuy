package com.java.easybuy.vo;

import java.sql.Date;

/**
 * 新闻，主页右上角的新闻列表的新闻
 */
public class News {
    //新闻编号
    private int id;
    //新闻标题
    private String title;
    //新闻内容
    private String content;
    //录入日期
    private Date createTime;

    public News(int id, String title, String content, Date createTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


}

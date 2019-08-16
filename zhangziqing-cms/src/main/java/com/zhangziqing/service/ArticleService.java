package com.zhangziqing.service;

import java.util.List;

import com.zhangziqing.pojo.Article;

public interface ArticleService {
	//增加
	public int add(Article article);
	
	//删除
	public int delete(int id);
	
	//修改
	public int update(Article article);
	
	//回显
	public Article toupdate(int id);
	
	//查询
	public List<Article> selectAll();
	
}

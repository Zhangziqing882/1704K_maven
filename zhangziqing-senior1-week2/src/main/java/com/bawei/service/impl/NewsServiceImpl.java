package com.bawei.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.NewsDao;
import com.bawei.pojo.News;
import com.bawei.service.NewsService;
import com.github.pagehelper.PageHelper;

@Service
public class NewsServiceImpl implements NewsService{

	@Autowired
	private NewsDao newsDao;
	@Override
	public List<News> queryAll(String name, int pageNum) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, 3);
		return newsDao.queryAll(name);
	}

}

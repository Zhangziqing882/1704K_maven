package com.bawei.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bawei.pojo.News;

public interface NewsService {
	public List<News> queryAll(@Param("name")String name,int pageNum);
	

}

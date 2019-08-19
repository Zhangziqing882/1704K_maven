package com.bawei.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bawei.pojo.News;

public interface NewsDao {
	
	public List<News> queryAll(@Param("name")String name);

}

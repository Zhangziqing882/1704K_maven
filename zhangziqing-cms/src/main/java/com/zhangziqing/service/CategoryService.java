package com.zhangziqing.service;

import java.util.List;
import com.zhangziqing.pojo.Category;

public interface CategoryService {
	//增加
	public int add(Category category);
	
	//删除
	public int delete(int id);
	
	//修改
	public int update(Category category);
	
	//回显
	public Category toupdate(int id);
	
	//查询
	public List<Category> selectAll();

}

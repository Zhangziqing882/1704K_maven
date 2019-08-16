package com.zhangziqing.service;

import java.util.List;

import com.zhangziqing.pojo.User;



public interface UserService {
	//增加
	public int add(User user);
	
	//删除
	public int delete(int id);
	
	//修改
	public int update(User user);
	
	//回显
	public User toupdate(int id);
	
	//查询
	public List<User> selectAll();

}

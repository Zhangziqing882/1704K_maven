package com.zhangziqing.service;

import java.util.List;

import com.zhangziqing.pojo.Settings;
public interface SettingsService {
	//增加
	public int add(Settings settings);
	
	//删除
	public int delete(int id);
	
	//修改
	public int update(Settings settings);
	
	//回显
	public Settings toupdate(int id);
	
	//查询
	public List<Settings> selectAll();

}

package com.zhangziqing.service;

import java.util.List;
import com.zhangziqing.pojo.Slide;

public interface SlideService {
	//增加
	public int add(Slide slide);
	
	//删除
	public int delete(int id);
	
	//修改
	public int update(Slide slide);
	
	//回显
	public Slide toupdate(int id);
	
	//查询
	public List<Slide> selectAll();

}

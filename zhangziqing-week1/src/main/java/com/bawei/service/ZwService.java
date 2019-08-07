package com.bawei.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import aj.org.objectweb.asm.Type;

import com.bawei.pojo.Zw;

public interface ZwService {
	//查询列表分页和模糊查询
	public List<Zw> queryAll(@Param("name")String name,int pageNum);
	//添加
	public int addZW(Zw zw);
	//查询所有类型
	public List<Type> selectAll();
	//删除
	public int deleteZw(String[] split);
	//回显
	public Zw queryById(int id);
	//修改
	public int update(Zw zw);

}

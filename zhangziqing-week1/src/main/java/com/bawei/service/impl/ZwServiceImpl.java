package com.bawei.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aj.org.objectweb.asm.Type;

import com.bawei.dao.ZwDao;
import com.bawei.pojo.Zw;
import com.bawei.service.ZwService;
import com.github.pagehelper.PageHelper;

@Service
public class ZwServiceImpl implements ZwService{
	@Autowired
	private ZwDao zwDao;

	@Override
	/**
	 * service实现类
	 * 实现查询列表分页和模糊查询
	 */
	public List<Zw> queryAll(String name, int pageNum) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, 4);
		return zwDao.queryAll(name);
	}
	/**
	 *实现添加
	 */

	@Override
	public int addZW(Zw zw) {
		// TODO Auto-generated method stub
		return zwDao.addZW(zw);
	}
	/**
	 * 实现查询类型
	 */
	@Override
	public List<Type> selectAll() {
		// TODO Auto-generated method stub
		return zwDao.selectAll();
	}
	@Override
	public int deleteZw(String[] id) {
		// TODO Auto-generated method stub
		return zwDao.deleteZw(id);
	}
	@Override
	public Zw queryById(int id) {
		// TODO Auto-generated method stub
		return zwDao.queryById(id);
	}
	@Override
	public int update(Zw zw) {
		// TODO Auto-generated method stub
		return zwDao.update(zw);
	}

}

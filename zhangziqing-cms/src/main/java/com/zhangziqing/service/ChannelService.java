package com.zhangziqing.service;

import java.util.List;

import com.zhangziqing.pojo.Channel;

public interface ChannelService {
	//增加
	public int add(Channel channel);
	
	//删除
	public int delete(int id);
	
	//修改
	public int update(Channel channel);
	
	//回显
	public Channel toupdate(int id);
	
	//查询
	public List<Channel> selectAll();

}

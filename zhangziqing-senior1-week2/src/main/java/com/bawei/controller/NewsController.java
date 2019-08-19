package com.bawei.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bawei.pojo.News;
import com.bawei.service.NewsService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("news")
public class NewsController {
	@Autowired
	private NewsService newsService;
	@RequestMapping("queryAll")
	public ModelAndView queryAll(String name,int pageNum){
		ModelAndView mv = new ModelAndView();
		List<News> list = newsService.queryAll(name, pageNum);
		mv.addObject("NewsList", new PageInfo<News>(list));
		mv.addObject("name", name);
		mv.addObject("pageNum", pageNum);
		mv.setViewName("list");
		return mv;
	}
}

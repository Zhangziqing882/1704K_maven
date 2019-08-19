/**
 * 
 */
package com.liuaoji.cms.web.controllers;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liuaoji.cms.core.Page;
import com.liuaoji.cms.domain.Article;
import com.liuaoji.cms.domain.Category;
import com.liuaoji.cms.domain.Channel;
import com.liuaoji.cms.domain.User;
import com.liuaoji.cms.service.ArticleService;
import com.liuaoji.cms.utils.FileUploadUtil;
import com.liuaoji.cms.utils.PageHelpUtil;
import com.liuaoji.cms.web.Constant;

/**
 * 说明:
 * 
 * @author howsun ->[howsun.zhang@gmail.com]
 * @version 1.0
 *
 * 2018年1月10日 下午2:40:38
 */
@Controller
@RequestMapping("/my")
public class UserController {

	@Autowired
	ArticleService articleService;
	
	@RequestMapping({"/", "/index", "/home"})
	public String home(){
		return "user-space/home";
	}
	
	@RequestMapping({"/profile"})
	public String profile(){
		return "user-space/profile";
	}
	
	//文章列表
	@RequestMapping("/blogs")
	public String blogs(HttpServletRequest request,Model model,
			@RequestParam(value="page",defaultValue="1")Integer page) {
		Article article = new Article();
		User user = (User) request.getSession().getAttribute(Constant.LOGIN_USER);
		//设置作者
		article.setAuthor(user);
		//分页
		PageHelper.startPage(page,3);
		//调用方法
		List<Article> articlelist = articleService.queryAll(article);
		//设置页数
		PageInfo<Article> pageInfo = new PageInfo<Article>(articlelist,3);
		//分页工具类
		String pageList = PageHelpUtil.page("/my/blogs", pageInfo, null);
		
		model.addAttribute("blogs", articlelist);
		model.addAttribute("pageList", pageList);
		
		return "user-space/blog_list";
	}
	
	//文章修改
	@RequestMapping("/blog/edit")
	public String blogEdit(Integer id,Model model) {
		Article article = articleService.selectByPrimaryKey(id);
		model.addAttribute("blog", article);
		return "user-space/blog_edit";
	}
	
	//文章发布和跟新
	@RequestMapping("/blog/save")
	public String blogSave(Article article,MultipartFile file,HttpServletRequest request) {
		//上传图片
		String upload = FileUploadUtil.upload(request, file);
		if(!upload.equals("")) {
			article.setPicture(upload);
		}
		//发布文章判断文章id是否存在
		if(article.getId() !=null) {
			article.setUpdated(new Date());
			articleService.updateByKey(article);
		}else {
			//设置文章发布默认的状态
			article.setHot(true);
			article.setHits(1);
			article.setStatus(1);
			article.setDeleted(false);
			article.setCreated(new Date());//发布时间
			article.setUpdated(new Date());//更新时间
			//设置当前登录的用户
			User user = (User) request.getSession().getAttribute(Constant.LOGIN_USER);
			//将当前登录的用户设置为文章作者
			article.setAuthor(user);
			//调用方法
			articleService.save(article);
		}
		return "redirect:/my/blogs";
	}
	
	//删除
	@RequestMapping("/blog/remove")
	public String remove(Integer id) {
		articleService.remove(id);
		return "redirect:/my/blogs";
	}
}

package com.bawei.controller;

import java.util.List;







import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import aj.org.objectweb.asm.Type;

import com.bawei.pojo.Zw;
import com.bawei.service.ZwService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/zw")
public class ZwController {
	@Autowired
	private ZwService zwService;
	/**
	 * 控制层实现列表
	 * 模糊查询和分页
	 * @param name
	 * @param pageNum
	 * @return
	 */
	@RequestMapping("/queryAll")
	public ModelAndView queryAll(String name,@RequestParam(required=false,defaultValue="1")int pageNum){
		ModelAndView mv = new ModelAndView();
		List<Zw> list = zwService.queryAll(name, pageNum);
		mv.addObject("zwList", new PageInfo<Zw>(list));
		mv.addObject("Zname",name);
		mv.addObject("pageNum", pageNum);
		mv.setViewName("list");
		return mv;
	}
	/**
	 * 添加
	 * @param zw
	 * @return
	 */
	@RequestMapping("/addZW")
	public String addZW(Zw zw){
			int addZW = zwService.addZW(zw);
		return "redirect:/zw/queryAll";
	}
	/**
	 * 查询所有类型
	 */
	@RequestMapping("/selectAll")
	@ResponseBody
	public List<Type> selectAll(){
		List<Type> list = zwService.selectAll();
		return list;
		
	}
	@RequestMapping("/deleteZw")
	public String deleteZw(String id){
		String[] ids = id.split(",");
		int i = zwService.deleteZw(ids);
		return "redirect:/zw/queryAll";
		}
	@RequestMapping("/queryById")
	public ModelAndView queryById(int id){
		ModelAndView mv = new ModelAndView();
		Zw zw = zwService.queryById(id);
		mv.addObject("zw", zw);
		mv.setViewName("update");
		return mv;
	}
	@RequestMapping("/update")
	public String update(Zw zw){
		int update = zwService.update(zw);
		return "redirect:/zw/queryAll";
	}
	@RequestMapping("/look")
	public ModelAndView look(int id){
		ModelAndView mv = new ModelAndView();
		Zw zw = zwService.queryById(id);
		mv.addObject("zw", zw);
		mv.setViewName("look");
		return mv;
	}
}

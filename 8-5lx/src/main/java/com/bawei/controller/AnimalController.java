package com.bawei.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bawei.pojo.Animal;
import com.bawei.service.AnimalService;

@Controller
public class AnimalController {
	@Autowired
	private AnimalService animalService;
	
	@RequestMapping("/queryAll")
	public ModelAndView queryAll(){
		ModelAndView mv = new ModelAndView();
		List<Animal> list = animalService.queryAll();
		mv.addObject("list", list);
		mv.setViewName("list");
		return mv;
	}
	@RequestMapping("/deleteAnimal")
	public String deleteAnimal(int id){
		int i = animalService.deleteAnimal(id);
		return "redirect:/queryAll";
	}
	@RequestMapping("/addAnimal")
	public String addAnimal(Animal animal){
		int i = animalService.addAnimal(animal);
		return "redirect:/queryAll";
	}
	@RequestMapping("/queryById")
	public ModelAndView queryById(int id){
		ModelAndView mv = new ModelAndView();
		Animal animal = animalService.queryById(id);
		System.out.println(animal);
		mv.addObject("animal", animal);
		mv.setViewName("update");
		return mv;
	}
	@RequestMapping("/updateAnimal")
	public String updateAnimal(Animal animal){
		int i = animalService.updateAnimal(animal);
		
		return "redirect:/queryAll";
	}
	
}

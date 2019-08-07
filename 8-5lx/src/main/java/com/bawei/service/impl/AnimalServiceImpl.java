package com.bawei.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.AnimalDao;
import com.bawei.pojo.Animal;
import com.bawei.service.AnimalService;

@Service
public class AnimalServiceImpl implements AnimalService{
	@Autowired
	private AnimalDao animalDao;

	@Override
	public List<Animal> queryAll() {
		// TODO Auto-generated method stub
		return animalDao.queryAll();
	}

	@Override
	public int addAnimal(Animal animal) {
		// TODO Auto-generated method stub
		return animalDao.addAnimal(animal);
	}

	@Override
	public int deleteAnimal(int id) {
		// TODO Auto-generated method stub
		return animalDao.deleteAnimal(id);
	}

	@Override
	public Animal queryById(int id) {
		// TODO Auto-generated method stub
		return animalDao.queryById(id);
	}

	@Override
	public int updateAnimal(Animal animal) {
		// TODO Auto-generated method stub
		return animalDao.updateAnimal(animal);
	}
	

}

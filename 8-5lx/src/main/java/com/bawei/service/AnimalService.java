package com.bawei.service;

import java.util.List;

import com.bawei.pojo.Animal;

public interface AnimalService {
	public List<Animal> queryAll();
	public int addAnimal(Animal animal);
	public int deleteAnimal(int id);
	public Animal queryById(int id);
	public int updateAnimal(Animal animal);

}

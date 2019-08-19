package com.bawei;
public class Person {
	private String name;
    private int love;
    private int health;

    public Person() {
        System.out.println("..");
    }

    public String getName() {
        return name;
    }

    public int getLove() {
        return love;
    }

    public int getHealth() {
        return health;
    }

    public Person(String name, int love, int health) {
        this.name = name;
        this.love = love;
        this.health = health;
    }

    public void print() {
        System.out.println(name + "\t" + love + "\t" + health);
    }

}

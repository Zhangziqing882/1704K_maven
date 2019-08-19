package com.bawei;

public class Dog extends Person{
	String starin;

    public Dog() {

    }

    public void print() {
        super.print();
        System.out.println("\t" + starin);
    }

    public String getStarin() {
        return starin;
    }

    public Dog(String name, int love, int health, String starin) {
        super(name, love, health);
        this.starin = starin;
    }

}

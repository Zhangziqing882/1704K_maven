package com.bawei;

public class Penguin extends Dog{
    String sex = "Q仔";

    public void print() {
        super.print();
        System.out.println("\t" + sex);
    }

    public String getSex() {
        return sex;
    }

    public Penguin() {

    }

    public Penguin(String name, int love, int health, String starin, String sex) {
        super(name, love, health, starin);
        this.sex = sex;
    }

}

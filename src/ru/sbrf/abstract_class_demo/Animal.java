package ru.sbrf.abstract_class_demo;

/**
 * Created by sbt-panichev-sl on 22.06.2018.
 */
public abstract class Animal {
    private int age;
    private String name;

    public Animal (int age, String name) {
        this.age=age;
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getName () {
        return name;
    }

    public void getName (String name) {
        this.name = name;
    }

    public abstract String say();
}

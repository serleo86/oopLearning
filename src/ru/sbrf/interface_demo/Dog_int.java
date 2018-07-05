package ru.sbrf.interface_demo;

/**
 * Created by sbt-panichev-sl on 22.06.2018.
 */
public class Dog_int implements Animal_interface {

    private int age;
    private String name;

    public Dog_int (int age, String name) {
        this.age=age;
        this.name=name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String say() {
        return "гав-гав";
    }
}

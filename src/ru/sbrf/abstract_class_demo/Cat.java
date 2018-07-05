package ru.sbrf.abstract_class_demo;

/**
 * Created by sbt-panichev-sl on 22.06.2018.
 */
public class Cat extends Animal {
    public Cat(int age, String name) {
        super(age, name);
    }
    @Override
    public String say () {
        return "мяу-мяу";
    }
}

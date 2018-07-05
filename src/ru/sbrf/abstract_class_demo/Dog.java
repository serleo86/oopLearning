package ru.sbrf.abstract_class_demo;

/**
 * Created by sbt-panichev-sl on 22.06.2018.
 */
public class Dog extends Animal {
    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public String say() {
        return "гаф-гаф";
    }
}

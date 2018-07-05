package ru.sbrf.abstract_class_demo;

/**
 * Created by sbt-panichev-sl on 22.06.2018.
 */
public class Startup_absclass {
    public static void main(String[] args) {
        Animal [] animals = {new Dog (3, "Шарик"), new Cat (2,"Петька")};

        for (Animal animal: animals) {
            System.out.println(animal.say());
        }
    }
}


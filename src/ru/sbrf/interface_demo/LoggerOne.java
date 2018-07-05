package ru.sbrf.interface_demo;

/**
 * Created by sbt-panichev-sl on 22.06.2018.
 */
public class LoggerOne implements Logger {
    @Override
    public void log(Animal_interface animal) {
        System.out.println(animal.say());
    }
}

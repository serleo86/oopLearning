package ru.sbrf.interface_demo;

/**
 * Created by sbt-panichev-sl on 22.06.2018.
 */
public class Startup_interface {
    //public static Logger logger = new LoggerOne();
    //public static Logger logger = new LoggerTwo();
    //public static Logger logger = new LoggerThree();

    public static void main(String[] args) {
        Animal_interface [] animals = {new Dog_int(7,"Барбос"), new Cat_int(67, "Варвара") };
        showAll(animals);
    }

    public static void showAll (Animal_interface [] animals) {
        for (Animal_interface animal_interface: animals) {
            //можжно вот так выводить конктерный лог
            //new LoggerThree().log(animal_interface);

            //а можно вот так выводить отдельный логгер по каждому животному
            if (animal_interface instanceof Dog_int)
                new LoggerTwo().log(animal_interface);
            else if (animal_interface instanceof Cat_int)
                new LoggerThree().log(animal_interface);
            else
                new LoggerOne().log(animal_interface);
        }
    }
}

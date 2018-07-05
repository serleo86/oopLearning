package ru.sbrf.learningCollection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by sbt-panichev-sl on 29.06.2018.
 */
public class SetCommand {
    Scanner scanner = new Scanner(System.in);
    public void handle() {
        Set set = new HashSet<>();
        while (true) {
            showOutMenuSet();
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println("Элементы коллекции: " + set);
                    break;

                case 2:
                    System.out.println("Коллекция пустая: " + set.isEmpty());
                    break;

                case 3:
                    containsItems(set);
                    break;

                case 4:
                    addItem(set);
                    break;

                case 5:
                    removeItem(set);
                    break;

                case 6:
                    return;
            }
        }
    }

    private static void showOutMenuSet() {
        System.out.println("Выберите действие над коллекцией:");
        System.out.println("1. showItems");
        System.out.println("2. isEmpty");
        System.out.println("3. contains");
        System.out.println("4. add");
        System.out.println("5. remove");
        System.out.println("6. goToMainMenu");

    }

    public void containsItems (Set set) {
        System.out.print("Введите элемент для проверки его нахождения в коллекции: ");
        System.out.println(set.contains(scanner.next()));
    }

    public void addItem (Set set) {
        System.out.print ("Введите элемент для добавления: ");
        set.add(scanner.next());
    }

    public void removeItem (Set set) {
        System.out.print ("Введите элемент для удаления: ");
        set.remove(scanner.next());
    }
}

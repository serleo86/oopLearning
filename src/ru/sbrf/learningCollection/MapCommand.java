package ru.sbrf.learningCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by sbt-panichev-sl on 29.06.2018.
 */
public class MapCommand {
    Scanner scanner = new Scanner(System.in);

    public void handle() {
        Map map = new HashMap<>();
        while (true) {
            showOutMenuMap();
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println("Элементы коллекции: " + map);
                    break;

                case 2:
                    System.out.println("Коллекция пустая: " + map.isEmpty());
                    break;

                case 3:
                    getItem(map);
                    break;

                case 4:
                    putItem(map);
                    break;

                case 5:
                    removeItem(map);
                    break;

                case 6:
                    return;
            }
        }
    }

    private static void showOutMenuMap() {
        System.out.println("Выберите действие над коллекцией:");
        System.out.println("1. showItems");
        System.out.println("2. isEmpty");
        System.out.println("3. get");
        System.out.println("4. put");
        System.out.println("5. remove");
        System.out.println("6. goToMainMenu");
    }

    private void getItem (Map map){
        System.out.print("Введите ключ элемента для вывода его значения: ");
        System.out.println(map.get(scanner.nextInt()));
    }

    private void putItem (Map map){
        System.out.print("Введите ключ и значение элемента: ");
        map.put(scanner.nextInt(), scanner.next());
    }

    private void removeItem (Map map){
        System.out.print("Введите ключ элемента для удаления его значения: ");
        map.remove(scanner.nextInt());
    }
}

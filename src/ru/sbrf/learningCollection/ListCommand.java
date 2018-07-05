package ru.sbrf.learningCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sbt-panichev-sl on 29.06.2018.
 */
public class ListCommand {
    Scanner scanner = new Scanner(System.in);

    public void handle () {
        List list = new ArrayList<>();
        while(true) {
            showOutMenuList();
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println("Коллекция состоит из следующих элементов: " + list);
                    break;

                case 2:
                    System.out.print("Список пустой? ");
                    System.out.println(list.isEmpty());
                    break;

                case 3:
                    containsItems(list);
                    break;

                case 4:
                    addItem(list);
                    break;

                case 5:
                    addByIndexItem(list);
                    break;

                case 6:
                    getByIndexItem(list);
                    break;

                case 7:
                    removeItem(list);
                    break;

                case 8:
                    removeItemByIndex(list);
                    break;

                case 9:
                    return;
            }
        }
    }

    private static void showOutMenuList() {
        System.out.println("Выберите действие над коллекцией:");
        System.out.println("1. showItems");
        System.out.println("2. isEmpty");
        System.out.println("3. contains");
        System.out.println("4. add");
        System.out.println("5. addByIndex");
        System.out.println("6. getByIndex");
        System.out.println("7. remove");
        System.out.println("8. removeByIndex");
        System.out.println("9. goToMainMenu");
    }

    private void containsItems (List list) {
        System.out.print("Введите значения для поиска в коллекции: ");
        boolean contains = list.contains(scanner.next());
        System.out.println("Есть ли элемент: " + contains);
    }

    private void addItem (List list) {
        System.out.print("Введите значения для добавления в список: ");
        list.add(scanner.next());
    }

    private void addByIndexItem (List list) {
        System.out.print("Введите значение и индекс для добавления элемента в список: ");
        list.add(scanner.nextInt(), scanner.next());
    }

    private void getByIndexItem (List list) {
        System.out.print("Введите индекс элемента для отображения: ");
        System.out.println(list.get(scanner.nextInt()));
    }

    private void removeItem (List list) {
        System.out.print("Введите элемент для удаления: ");
        list.remove(scanner.next());
    }

    private void removeItemByIndex (List list) {
        System.out.print("Введите индекс элемента для удаления: ");
        list.remove(scanner.nextInt());
    }
}

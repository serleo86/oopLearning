package ru.sbrf.learningCollection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Created by sbt-panichev-sl on 29.06.2018.
 */
public class DequeCommand {
    Scanner scanner = new Scanner(System.in);
    public void handle() {
        Deque deque = new ArrayDeque<>();
        while (true) {
            showOutMenuDeque();
            int command = scanner.nextInt();
            switch(command){
                case 1:
                    System.out.println("Коллекция состоит из следующих элементов: " + deque);
                    break;

                case 2:
                    System.out.println("Коллекция пустая: " + deque.isEmpty());
                    break;

                case 3:
                    containsItems(deque);
                    break;

                case 4:
                    addFirstItem(deque);
                    break;

                case 5:
                    addLastItem(deque);
                    break;

                case 6:
                    getFirstItem(deque);
                    break;

                case 7:
                    getLastItem(deque);
                    break;

                case 8:
                    pollFirstItem(deque);
                    break;

                case 9:
                    pollLastItem(deque);
                    break;

                case 10:
                    removeFirstItem(deque);
                    break;

                case 11:
                    removeLastItem(deque);
                    break;

                case 12:
                    return;
            }
        }
    }

    private static void showOutMenuDeque() {
        System.out.println("Выберите действие над коллекцией:");
        System.out.println("1. showItems");
        System.out.println("2. isEmpty");
        System.out.println("3. contains");
        System.out.println("4. addFirst");
        System.out.println("5. addLast");
        System.out.println("6. getFirst");
        System.out.println("7. getLast");
        System.out.println("8. pollFirst");
        System.out.println("9. pollLast");
        System.out.println("10. removeFirst");
        System.out.println("11. removeLast");
        System.out.println("12. goToMainMenu");
    }

    public void containsItems (Deque deque) {
        System.out.print("Введите элемент: ");
        System.out.println(deque.contains(scanner.next()));
    }

    public void addFirstItem (Deque deque) {
        System.out.print("Введите значения для добавления в начало: ");
        deque.addFirst(scanner.next());
    }

    public void addLastItem (Deque deque) {
        System.out.print("Введите значения для добавления в конец: ");
        deque.addLast(scanner.next());
    }

    public void getFirstItem (Deque deque) {
        System.out.println("Первое значение равно: " + deque.getFirst());
    }

    public void getLastItem (Deque deque) {
        System.out.println("Первое значение равно: " + deque.getLast());
    }

    public void pollFirstItem (Deque deque){
        System.out.println("Первый элемент, который будет удален: " + deque.pollFirst());
    }

    public void pollLastItem (Deque deque){
        System.out.println("Первый элемент, который будет удален: " + deque.pollLast());
    }

    public void removeFirstItem (Deque deque){
        System.out.println("Удаленный элемент, который был первым: " + deque.removeFirst());
    }

    public void removeLastItem (Deque deque){
        System.out.println("Удаленный элемент, который был последним: " + deque.removeLast());
    }
}


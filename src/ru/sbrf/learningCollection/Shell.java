package ru.sbrf.learningCollection;

import java.util.Scanner;

/**
 * Created by sbt-panichev-sl on 27.06.2018.
 */
public class Shell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            showOutMenuShell();
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    new ListCommand().handle();
                    break;

                case 2:
                    new SetCommand().handle();
                    break;

                case 3:
                    new DequeCommand().handle();
                    break;

                case 4:
                    new MapCommand().handle();
                    break;

                case 5:
                    System.exit(0);
                    return;
            }
        }
    }

    private static void showOutMenuShell() {
        System.out.println("Выберите коллекцию:");
        System.out.println("1. List");
        System.out.println("2. Set");
        System.out.println("3. Deque");
        System.out.println("4. Map");
        System.out.println("5. Exit");

    }
}

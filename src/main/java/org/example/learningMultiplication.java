package org.example;

import java.util.Scanner;

class LearningMultiplication {
    private Scanner scanner = new Scanner(System.in);
    boolean exit = true;

    private void table() {
        System.out.println("\t\t\tTABLE:");
        for (int i = 2; i <= 9; i++) {
            System.out.println("\nна " + i + ":");
            for (int j = 2; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }

    private void mainMenu() {
        String choice;

        System.out.print("\t\t\tMAIN MENU(beta):\n" +
                "'1' - посмотреть таблицу\n" +
                "'2' - учить\n" +
                "'3' - тест\n" +
                "'4' - выход\n" +
                "Ввод: ");
        choice = scanner.nextLine();
        switch (choice) {
            case "1":
                table();
                break;
            case "2":
                Learn learn = new Learn();
                break;
            case "3":
                Test test = new Test();
                break;
            case "4":
                System.out.println("exit");
                exit = false;
                break;
        }
    }

    public void start() {
        while (exit) {
            mainMenu();
        }
    }
}
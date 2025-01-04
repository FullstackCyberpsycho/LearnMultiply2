package org.example;

import java.util.Random;
import java.util.Scanner;

public class Test {
    private Scanner scanner = new Scanner(System.in);

    public Test() {
        String choice;
        System.out.print("\t\t\tTEST menu:\n" +
                "'1' - начать тест\n" +
                "'2' - вернуться в главное меню!\n" +
                "Ввод: ");
        choice = scanner.nextLine();

        if(choice.equals("1")) {
            System.out.print("\tВыберите режим:\n" +
                    "'1' - тест на ваше число\n" +
                    "'2' - тест на случайные числа\n" +
                    "'3' - вернуться в главное меню!\n" +
                    "Ввод: ");
            choice = scanner.nextLine();

            if (choice.equals("1")) {
                testUserNum();
            } else if (choice.equals("2")){
                learnRandNum();
            }

        } else {
            System.out.println("exit");
        }
    }

    private void testUserNum() {
        int numTest, count = 0, numMultiplier, min = 2, max = 9,
                numAnswer, numRes;
        Random random = new Random();
        System.out.print("Тест умножения на: ");
        numTest = scanner.nextInt();

        while (true) {
            numMultiplier = random.nextInt(max - min + 1) + min;
            numRes = numTest * numMultiplier;
            System.out.print("\nсчет: " + count + "! Введите ваш ответ:\n" +
                    numTest + " * " + numMultiplier + " = ");
            numAnswer = scanner.nextInt();

            if (numAnswer == numRes) {
                count++;
                System.out.println("ответ правильный!");
            } else if (numAnswer == 1){
                System.out.println("exit");
                break;
            } else {
                if (count <= 0) {
                    count = 0;
                } else {
                    count--;
                }

                System.out.println("Ответ не правильный!");
            }

        }
    }

    private void learnRandNum() {
        int numTest, count = 0, numMultiplier, min = 2, max = 9,
                numAnswer, numRes;
        Random random = new Random();

        while (true) {
            numTest = random.nextInt(max - min + 1) + min;
            numMultiplier = random.nextInt(max - min + 1) + min;
            numRes = numTest * numMultiplier;
            System.out.print("\nсчет: " + count + "! Введите ваш ответ:\n" +
                    numTest + " * " + numMultiplier + " = ");
            numAnswer = scanner.nextInt();

            if (numAnswer == numRes) {
                count++;
                System.out.println("ответ правильный!");
            } else if (numAnswer == 1){
                System.out.println("exit");
                break;
            } else {
                count--;
                System.out.println("Ответ не правильный!");
            }
        }
    }
}

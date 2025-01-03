package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Learn {
    private Scanner scanner = new Scanner(System.in);

    public Learn() {
        String choice;
        System.out.print("\t\t\tLEARN menu:\n" +
                "'1' - начать изучения\n" +
                "'2' - вернуться в главное меню!\n" +
                "Ввод: ");
        choice = scanner.nextLine();

        if(choice.equals("1")) {
            System.out.print("\tВыберите режим:\n" +
                    "'1' - изучения на ваше число\n" +
                    "'2' - изучение на случайные числа\n" +
                    "'3' - вернуться в главное меню!\n" +
                    "Ввод: ");
            choice = scanner.nextLine();

            if (choice.equals("1")) {
                learnUserNum();
            } else if (choice.equals("2")){
                learnRandNum();
            }

        } else {
            System.out.println("exit");
        }
    }

    private String response(int numRes) {
        ArrayList<Integer> responses = new ArrayList<>();
        Random random = new Random();
        int num, index;

        for (int i = 0; i < 4; i++) {
            num = random.nextInt(numRes);
            responses.add(num);
        }
        index = random.nextInt(4);
        responses.set(index, numRes);

        return responses.toString();
    }

    private void learnUserNum() {
        int numLearn, count = 0, numMultiplier, min = 2, max = 9,
                numAnswer, numRes;
        Random random = new Random();
        System.out.print("Изучения умножения на: ");
        numLearn = scanner.nextInt();

        System.out.println("ВНИМАНИЕ!\n" +
                "Правила: вы должны выбрать правильный ответ из перечисленных\n" +
                "например: <5 x 6 = ?> выберите правильный ответ(35, 30, 45, 25)\n" +
                "'1' - вернуться в главное меню!");

        while (true) {
            numMultiplier = random.nextInt(max - min + 1) + min;
            numRes = numLearn * numMultiplier;
            System.out.print("\nсчет: " + count + "! Введите ваш ответ:\n" +
                    response(numRes) + "\n" +
                    numLearn + " * " + numMultiplier + " = ");
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

    private void learnRandNum() {
        int numLearn, count = 0, numMultiplier, min = 2, max = 9,
                numAnswer, numRes;
        Random random = new Random();

        System.out.println("ВНИМАНИЕ!\n" +
                "Правила: вы должны выбрать правильный ответ из перечисленных\n" +
                "например: <5 x 6 = ?> выберите правильный ответ(35, 30, 45, 25)\n" +
                "'1' - вернуться в главное меню!");

        while (true) {
            numLearn = random.nextInt(max - min + 1) + min;
            numMultiplier = random.nextInt(max - min + 1) + min;
            numRes = numLearn * numMultiplier;
            System.out.print("\nсчет: " + count + "! Введите ваш ответ:\n" +
                    response(numRes) + "\n" +
                    numLearn + " * " + numMultiplier + " = ");
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

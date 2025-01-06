package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Learn {
    private Scanner scanner = new Scanner(System.in);
    private int numLearn, count = 0, numMultiplier = 1, min = 2, max = 9,
            numAnswer, numRes, true_ = 0, false_ = 0;
    private Random random = new Random();
    private String choice;

    public Learn() {
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

    private String response(int numRes, int numLearn) {
        ArrayList<Integer> responses = new ArrayList<>();
        int num, index;

        for (int i = 0; i < 4; i++) {
            num = random.nextInt(numLearn*10);
            responses.add(num);
        }
        index = random.nextInt(4);
        responses.set(index, numRes);

        return responses.toString();
    }

    private void learnUserNum() {

        System.out.print("\tВыберите режим:\n" +
                "'1' - изучения по возрастанию чисел\n" +
                "'2' - изучение на случайные числа\n" +
                "'3' - вернуться в главное меню!\n" +
                "Ввод: ");

        choice = scanner.nextLine();

        if (choice.equals("1")) {
            learnUserNumOrderMagnitude();
        } else if (choice.equals("2")){
            learnUserNumRand();
        }
    }

    private void learnUserNumOrderMagnitude() {

        System.out.print("Изучения умножения на: ");
        numLearn = scanner.nextInt();

        System.out.println("ВНИМАНИЕ!\n" +
                "Правила: вы должны выбрать правильный ответ из перечисленных\n" +
                "например: <5 x 6 = ?> выберите правильный ответ(35, 30, 45, 25)\n" +
                "'1' - вернуться в главное меню!");

        while (true) {
            numMultiplier++;
            if (numMultiplier > 9) {
                numMultiplier = 2;
            }

            numRes = numLearn * numMultiplier;

            System.out.print("\nсчет: " + count + "! Введите ваш ответ:\n" +
                    response(numRes, numLearn) + "\n" +
                    numLearn + " * " + numMultiplier + " = ");
            numAnswer = scanner.nextInt();

            if (numAnswer == numRes) {
                count++;
                true_++;
                System.out.println("ответ правильный!\n" +
                        "Правильных ответов: " + true_ +
                        "\nНе правильных ответов: " + false_);
            } else if (numAnswer == 1){
                System.out.println("exit");
                break;
            } else {
                if (count <= 0) {
                    count = 0;
                    false_++;
                } else {
                    count--;
                    false_++;
                }
                System.out.println("Ответ не правильный! Правильный ответ был: " + numRes +
                        "\nНе правильных ответов: " + false_ +
                        "\nПравильных ответов: " + true_);
            }

        }
    }


    private void learnUserNumRand() {

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
                    response(numRes, numLearn) + "\n" +
                    numLearn + " * " + numMultiplier + " = ");
            numAnswer = scanner.nextInt();

            if (numAnswer == numRes) {
                count++;
                true_++;
                System.out.println("ответ правильный!\n" +
                        "Правильных ответов: " + true_ +
                        "\nНе правильных ответов: " + false_);
            } else if (numAnswer == 1){
                System.out.println("exit");
                break;
            } else {
                if (count <= 0) {
                    count = 0;
                    false_++;
                } else {
                    count--;
                    false_++;
                }

                System.out.println("Ответ не правильный! Правильный ответ был: " + numRes +
                        "\nНе правильных ответов: " + false_ +
                        "\nПравильных ответов: " + true_);
            }
        }
    }

    private void learnRandNum() {

        System.out.println("ВНИМАНИЕ!\n" +
                "Правила: вы должны выбрать правильный ответ из перечисленных\n" +
                "например: <5 x 6 = ?> выберите правильный ответ(35, 30, 45, 25)\n" +
                "'1' - вернуться в главное меню!");

        while (true) {
            numLearn = random.nextInt(max - min + 1) + min;
            numMultiplier = random.nextInt(max - min + 1) + min;
            numRes = numLearn * numMultiplier;
            System.out.print("\nсчет: " + count + "! Введите ваш ответ:\n" +
                    response(numRes, numLearn) + "\n" +
                    numLearn + " * " + numMultiplier + " = ");
            numAnswer = scanner.nextInt();

            if (numAnswer == numRes) {
                count++;
                true_++;
                System.out.println("ответ правильный!\n" +
                        "Правильных ответов: " + true_ +
                        "\nНе правильных ответов: " + false_);
            } else if (numAnswer == 1){
                System.out.println("exit");
                break;
            } else {
                if (count <= 0) {
                    count = 0;
                    false_++;
                } else {
                    count--;
                    false_++;
                }
                System.out.println("Ответ не правильный! Правильный ответ был: " + numRes +
                        "\nНе правильных ответов: " + false_ +
                        "\nПравильных ответов: " + true_);
            }

        }
    }
}

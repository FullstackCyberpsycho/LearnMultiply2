package org.example;

import java.util.Random;
import java.util.Scanner;

public class Test {
    private Scanner scanner = new Scanner(System.in);
    private int true_ = 0, false_ = 0,
            numTest, count = 0, numMultiplier, min = 2, max = 9,
            numAnswer, numRes;
    private Random random = new Random();

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

        while (true) {
            numTest = random.nextInt(max - min + 1) + min;
            numMultiplier = random.nextInt(max - min + 1) + min;
            numRes = numTest * numMultiplier;
            System.out.print("\nсчет: " + count + "! Введите ваш ответ:\n" +
                    numTest + " * " + numMultiplier + " = ");
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

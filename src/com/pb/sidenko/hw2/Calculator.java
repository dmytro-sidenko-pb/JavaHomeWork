package com.pb.sidenko.hw2;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int operand1;
        int operand2;
        int outcome = 0;
        String sign;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        operand1 = scanner.nextInt();
        System.out.println("Введите второе целое число:");
        operand2 = scanner.nextInt();
        System.out.println("Ввведите оператор:");
        sign = scanner.next();
        System.out.println("Итого:");
        switch (sign) {
            case ("+"):
                outcome = operand1 + operand2;
                break;
            case ("-"):
                outcome = operand1 - operand2;
                break;
            case ("*"):
                outcome = operand1 * operand2;
                break;
            case ("/"):
                if (operand2 == 0) {
                    System.out.println("Операция деления на ноль недопустима!");
                    break;
                }
                outcome = operand1 / operand2;
                break;
        }
        System.out.println(outcome);


    }

}

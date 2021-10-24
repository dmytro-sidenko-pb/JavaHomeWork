package com.pb.sidenko.hw3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unknownNumber = (int) (Math.random() * 101);
        int attempt = 0;
        int userNumber;
        System.out.println("Отгадайте число в диапазоне от 0 до 100 посредством ввода числа с клавиатуры, если хотите завершить игру досрочно введите число 1000");
        do {
            attempt++;
            System.out.print("Введите ваше число: ");
            userNumber = scanner.nextInt();
            if (userNumber == 1000) {
                System.out.println("Игра окончена, вы вышли");
            } else if (userNumber < unknownNumber) {
                System.out.println("Моё число больше вашего.");
            } else if (userNumber > unknownNumber) {
                System.out.println("Моё число менше вашего");
            } else System.out.println("BINGO! Вы угадали! Колличество попыток: " + attempt);
        } while (userNumber != unknownNumber && userNumber != 1000);
    }
}


package com.pb.sidenko.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int digit;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите число:");
        digit = scanner.nextInt();
        if (digit >= 0 && digit <= 14) {
            System.out.println("Введенное чило в интервале [0-14]");
        } else if (digit >= 15 && digit <= 35) {
            System.out.println("Введенное чило в интервале [15-35]");
        } else if (digit >= 36 && digit <= 50) {
            System.out.println("Введенное чило в интервале [36-50]");
        } else if (digit >= 51 && digit <= 100) {
            System.out.println("Введенное чило в интервале [51-100]");
        } else  {
            System.out.println("Введенное чило не попадает ни в один из интервалов");
        }
    }
}

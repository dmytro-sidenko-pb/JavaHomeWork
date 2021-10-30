package com.pb.sidenko.hw4;

import java.util.Scanner;

public class CapitalLetter {
    private static String replaceFirstCharWordOfString(String input) {
        String[] tmpArr = input.split(" ");
        String result = "";
        for (int i = 0; i < tmpArr.length; i++) {
            if (tmpArr[i].length() > 1) {
                char oldFirst = tmpArr[i].charAt(0);
                result += tmpArr[i].substring(0, 1).toUpperCase() + tmpArr[i].substring(1, tmpArr[i].length()) + " ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение и программа выведет все слова предложения с заглавной буквы");
        String sentence = scanner.nextLine();
        System.out.println("До обработки: " + sentence);
        System.out.println("После обработки: " + replaceFirstCharWordOfString(sentence));
    }
}


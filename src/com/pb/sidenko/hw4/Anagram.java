package com.pb.sidenko.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean isAnagram(String firstWord, String secondWord) {
        char[] word1 = firstWord.toLowerCase().replaceAll("[\\s]", "").toCharArray();
        char[] word2 = secondWord.toLowerCase().replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа проверят два введенных пользователем предложения на анаграмму");
        System.out.println("Введите первое предложение:");
        String sentence1 = scanner.nextLine();
        System.out.println("Введите второе предложение:");
        String sentence2 = scanner.nextLine();
        if (isAnagram(sentence1, sentence2) == true) {
            System.out.println("Введенные Вами предложения анаграммы!");
        } else {
            System.out.println("Введенные Вами предложения не анаграммы!");
        }
    }
}

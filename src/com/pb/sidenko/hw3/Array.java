package com.pb.sidenko.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static String bubbleSort(int[] array) {
        boolean unsorted = true;
        int temp;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        String intArrayString;
        int sumArrayElements = 0;
        int countPositiveElements = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println("Введите " + i + " элемент массива");
            array[i] = scanner.nextInt();
            sumArrayElements = sumArrayElements + array[i];
            if (array[i] > 0) {
                countPositiveElements++;
            }
        }
        intArrayString = Arrays.toString(array);
        System.out.println("Массив: " + intArrayString);
        System.out.println("Сума всех элементов массива: " + sumArrayElements);
        System.out.println("Колличество положительных элементов массива: " + countPositiveElements);
        System.out.println("Отсортированный массив:" + bubbleSort(array));
    }
}



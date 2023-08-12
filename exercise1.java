package ru.academits.java.lesson4;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число интервала: ");
        int firstNumber = scanner.nextInt();

        while (firstNumber <= 1) {
            System.out.println("Первое число интервала должно быть больше 1. Введите число повторно: ");
            firstNumber = scanner.nextInt();
        }

        System.out.print("Введите последнее число интервала:");
        int lastNumber = scanner.nextInt();
        int numberSum = 0;
        int numberCount = 0;

        for (int i = firstNumber; i <= lastNumber; i++) {
            numberSum += i;
            numberCount += 1;

        }
        System.out.println("Среднее арифметическое целых чисел введенного интервала = " + (double) numberSum / numberCount);
    }
}

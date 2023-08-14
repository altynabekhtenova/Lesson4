import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число интервала: ");
        int firstNumber = scanner.nextInt();

        while (firstNumber <= 1) {
            System.out.println("Первое число интервала должно быть больше 1. Введите число повторно: ");
            firstNumber = scanner.nextInt();
        }

        System.out.print("Введите последнее число интервала: ");
        int lastNumber = scanner.nextInt();
        int numberSum = 0;
        int numberCount = 0;
        int evenNumbersSum = 0;
        int evenNumbersNum = 0;

        for (int i = firstNumber; i <= lastNumber; i++) {
            numberSum += i;
            numberCount += 1;
            if (i % 2 == 0) {
                evenNumbersSum += i;
                evenNumbersNum += 1;
            }
        }
        System.out.println("Среднее арифметическое целых чисел введенного интервала = " + (double) numberSum / numberCount);
        System.out.println("Среднее арифметическое четных чисел введенного интервала = " + (double) evenNumbersSum / evenNumbersNum);
    }
}

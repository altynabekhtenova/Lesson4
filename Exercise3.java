import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int integer = scanner.nextInt();
        int evenSum = 0;
        int maxNumber = 0;

        for (int i = integer; i > 0; i /= 10) {
            if (i % 2 != 0) {
                evenSum += i % 10;
            }

            if (i % 10 > maxNumber) {
                maxNumber = i % 10;
            }

        }
        System.out.println("Сумма нечетных чисел, из которых состоит введенное число = " + evenSum);
        System.out.println("Максимальная цифра введенного числа = " + maxNumber);
    }
}

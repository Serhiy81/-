package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Створюємо Scanner
        Scanner scanner = new Scanner(System.in);

        // Отримання даних від користувача

        System.out.print("Input int num 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Input int num 2: ");
        int num2 = scanner.nextInt();

        // Можливі виведення

        String outp1 = "число " + num1 +
                " більше чим  числа " +
                num2 + ".";

        String outp2 = "число " + num1 +
                " менше чим  числа " +
                num2 + ".";

        // Визначення виведення за умови
        String res = num1 > num2 ? outp1 : outp2;
        // Виведення
        System.out.println(res);

        scanner.close();


    }
}

package Java_DZ.DZ1;

import java.util.Objects;
import java.util.Scanner;

public class validator {

    static int validatePosInt() {
        System.out.print("Введите n число: ");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                if (n > 0 && n < 2_147_483_647) {
//                    scanner.close();
                    return n;
                } else System.out.print("Введи 'число!', больше нуля: ");
            } catch (Exception ex) {
                System.out.print("Введи 'число!', больше нуля: ");
            }
        }
    }

    static double validateDouble() {
        System.out.print("Введите число: ");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                return scanner.nextDouble();
            } catch (Exception ex) {
                System.out.print("Введи 'число!': ");
            }
        }
    }

    static String valOperator() {
        System.out.print("Введите оператор: ");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                String s = scanner.next();
                if (Objects.equals(s, "+") || Objects.equals(s, "-") || Objects.equals(s, "*")
                        || Objects.equals(s, "/") || Objects.equals(s, "^")
                        || Objects.equals(s, "c") || Objects.equals(s, "с")) {
                    return s;
                } else {
                    System.out.print("Введите '+' '-' '*' '/' '^' или 'c' для сброса: ");
                }
//                scanner.close();
            } catch (Exception ex) {
                System.out.print("Введите '+' '-' '*' '/' '^' или 'c' для сброса: ");
            }
        }
    }
}

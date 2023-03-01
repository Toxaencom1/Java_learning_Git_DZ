package Java_DZ.DZ6;

import java.util.Scanner;

public class Validator {
    public static Integer valMenuChoice(String choice){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                emergency_exit(choice);
                if (Integer.parseInt(choice) > 0 && Integer.parseInt(choice) <= 2) {//
                    return Integer.parseInt(choice);
                } else {
                    System.out.print("Введите 1 или 2: ");
                    choice = scanner.nextLine();
                }
            } catch (Exception ex) {
                System.out.print("Введите 1 или 2: ");
                choice = scanner.nextLine();
            }
        }
    }
    public static Integer valInt(String choice){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                emergency_exit(choice);
                if (Integer.parseInt(choice) > -2_147_483_648 && Integer.parseInt(choice) < 2_147_483_647) {//
                    return Integer.parseInt(choice);
                } else {
                    System.out.print("Введите число: ");
                    choice = scanner.nextLine();
                }
            } catch (Exception ex) {
                System.out.print("Введите число: ");
                choice = scanner.nextLine();
            }
        }
    }
    public static double valDouble(String choice){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                emergency_exit(choice);
                if (Double.parseDouble(choice) > -2_147_483_648.0 && Double.parseDouble(choice) < 2_147_483_647.0) {//
                    return Double.parseDouble(choice);
                } else {
                    System.out.print("Введите вещественное число: ");
                    choice = scanner.nextLine();
                }
            } catch (Exception ex) {
                System.out.print("Введите вещественное число: ");
                choice = scanner.nextLine();
            }
        }
    }
    public static String emergency_exit(String string){
        if(string.equals("exit")){
            System.exit(0);
        }
        return string;
    }
}

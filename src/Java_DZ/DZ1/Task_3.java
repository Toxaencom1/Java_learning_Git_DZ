package Java_DZ.DZ1;


// 3. Реализовать простой калькулятор

import java.util.Objects;

public class Task_3 {
    static double summary(double x, double y) {
        return x + y;
    }

    static double diff(double x, double y) {
        return x - y;
    }

    static double multiplication(double x, double y) {
        return x * y;
    }

    static double div(double x, double y) {
        return x / y;
    }

    static double pow(double x, double y) {
        return Math.pow(x, y);
    }

    static double solution(double x, double y, String operator) {
        double result = 0;
        switch (operator) {
            case "+" -> {
                result = summary(x, y);
                System.out.println("Выражение = " + result);
                return result;
            }
            case "-" -> {
                result = diff(x, y);
                System.out.println("Выражение = " + result);
                return result;
            }
            case "*" -> {
                result = multiplication(x, y);
                System.out.println("Выражение = " + result);
                return result;
            }
            case "/" -> {
                result = div(x, y);
                System.out.println("Выражение = " + result);
                return result;
            }
            case "^" -> {
                result = pow(x, y);
                System.out.println("Выражение = " + result);
                return result;
            }
            default -> {
                return result;
            }
        }
    }

    public static void main(String[] args) {
        double x = validator.validateDouble();
        String operator = validator.valOperator();
        double y = validator.validateDouble();
        double result = solution(x, y, operator);
        while (true) {
            operator = validator.valOperator();
            if (Objects.equals(operator, "c") || Objects.equals(operator, "с")) {
                System.out.println("Выполнен сброс!");
                result = validator.validateDouble();
                operator = validator.valOperator();
            }
            double c = validator.validateDouble();
            result = solution(result, c, operator);
        }
    }
}

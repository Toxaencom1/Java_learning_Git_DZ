package Java_DZ.DZ2;

import Java_DZ.DZ2.validator;

import java.io.File;
import java.io.FileWriter;
import java.util.Objects;

public class Task_4 {

    public static void writeToFile(String data) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("\\src\\Java_DZ\\DZ2\\Task4_log.txt");
            File file = new File(pathFile);
//            System.out.println(file.getAbsolutePath());
//            System.out.println(pathFile);
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(data + "\n");
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Не по плану");
        }
    }
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
    static public void exitString0(String zero){
        if (Objects.equals(zero, "0")){
            System.out.println("Выход из приложения");
            writeToFile("Выход из приложения");
            System.exit(0);
        }
    }
    static public void exitDouble0(Double zero){
        if (zero == 0){
            System.out.println("Выход из приложения");
            writeToFile("Выход из приложения");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        System.out.println("Приложение Калькулятор! Для сброса введите символ 'с' для выхода '0'.");
        StringBuilder sb = new StringBuilder();
        double x = validator.validateDouble();
        exitDouble0(x);
        String operator = validator.valOperator();
        exitString0(operator);
        double y = validator.validateDouble();
        exitDouble0(y);
        double result = solution(x, y, operator);
        sb.append(String.valueOf(x))
                .append(" ").append(operator).append(" ")
                .append(String.valueOf(y)).append(" = ")
                .append(String.valueOf(result));
        writeToFile(sb.toString());
        while (true) {
            sb.replace(0,sb.length(),String.valueOf(result));
            operator = validator.valOperator();
            exitString0(operator);
            if (Objects.equals(operator, "c") || Objects.equals(operator, "с")) {
                System.out.println("Выполнен сброс!");
                writeToFile("Сброс приложения");
                sb.replace(0,sb.length(),"");
                result = validator.validateDouble();
                operator = validator.valOperator();
                exitString0(operator);
                sb.append(String.valueOf(result));
            }
            double c = validator.validateDouble();
            exitDouble0(c);
            result = solution(result, c, operator);
            sb.append(" ").append(operator).append(" ").append(String.valueOf(c)).append(" = ").append(result);
            writeToFile(sb.toString());
        }
    }
}

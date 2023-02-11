package Java_DZ.DZ1;

//4. *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
//        могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется
//        восстановить выражение до верного равенства. Предложить хотя бы
//        одно решение или сообщить, что его нет.
public class Task_4 {
    static int signs(String n) {
        int num = 0;
        for (int i = 0; i < n.length(); i++) {
            char pos = n.charAt(i);
            if (pos != '?' && i == 0) {
                num = Character.getNumericValue(pos) * 10;
                return num;
            } else if (pos != '?' && i == 1) {
                num = Character.getNumericValue(pos);
                return num;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        String ex = "2? + ?5 = 69";
//        String ex = "?4 + 4? = 69";
//        String ex = "2? + 4? = 69";
//        String ex = "?4 + ?5 = 69";
        String[] expression_string = ex.split("=");
        int right = Integer.parseInt(expression_string[1].trim());
        String left = expression_string[0].trim();
        left = left.replace(" + ", " ");
        String[] left_arr = left.split(" ");
        String x_string = left_arr[0];
        String y_string = left_arr[1];
        int x = signs(x_string);
        int y = signs(y_string);
        String result = "";
        // Получислось очень сложно для чтения, поэтому переделал код ниже на основые возможные условия
        // можно было сделать наоборот и не повторять циклы но так сложнее прочитать
        if (x > 10 && y < 10) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if ((x + i) + y + j * 10 == right) {
                        result = (x + i) + " + " + (y + (j * 10)) + " = " + right;
                        System.out.println(result);
                    }
                }
            }
        } else if (y > 10 && x < 10) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if ((x + i * 10) + (y + j) == right) {
                        result = (x + i * 10) + " + " + (y + j) + " = " + right;
                        System.out.println(result);
                    }
                }
            }
        } else if (x > 10 && y > 10) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if ((x + i) + (y + j) == right) {
                        result = (x + i) + " + " + (y + j) + " = " + right;
                        System.out.println(result);
                    }
                }
            }
        } else if (x < 10 && y < 10) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (x + i * 10 + y + j * 10 == right) {
                        result = (x + i * 10) + " + " + (y + j * 10) + " = " + right;
                        System.out.println(result);
                    }
                }
            }
        }
        if (result.isEmpty()) {
            System.out.println("Решения нет");
        }
    }
}

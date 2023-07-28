package Java_DZ.DZ3;

//3.Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.

import java.util.*;

public class Task_3 {
    public static Integer findMin(List<Integer> list) {
        return Collections.min(list);
    }

    public static Integer findMax(List<Integer> list) {
        return Collections.max(list);
    }

    public static double findAverage(List<Integer> list) {
        double average = 0;
        for (Integer value : list) average += value;
        average = average/list.size();
        return average;
    }

    public static void main(String[] args) {
        ArrayList<Integer> randomList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов списка: ");
        int n = scanner.nextInt();
        scanner.close();
        Random random = new Random();
        for (int i = 0; i < n; i++) randomList.add(random.nextInt(0, 100));
        System.out.println(randomList + " - Целочисленный список");
        System.out.println(findMin(randomList) + " - Минимальное значение списка");
        System.out.println(findMax(randomList) + " - Максимальное значение списка");
        System.out.println(findAverage(randomList) + " - Среднее арифметическое значение списка");
    }
}

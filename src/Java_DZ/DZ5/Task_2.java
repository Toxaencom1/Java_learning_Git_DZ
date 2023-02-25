package Java_DZ.DZ5;
/*
Пусть дан список сотрудников:
        Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина,
        Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов,
        Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова,
        Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
 */

import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        String dataSource = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, " +
                "Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, " +
                "Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, " +
                "Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        List<String> employeesFullNames = List.of(dataSource.split(", "));
        System.out.println(employeesFullNames + " - Источник данных");
        String name;
        Map<String, Integer> map = new HashMap<>();
        for (String el : employeesFullNames) {
            name = List.of(el.split(" ")).get(0);
            if (map.containsKey(name)) {
                map.put(name, map.get(name) + 1);
            } else {
                map.put(name, 1);
            }
        }
        System.out.println(map + " - Повторяющиеся имена с количеством повторений");

        List<String> tempRepeatNames = new ArrayList<>();
        List<String> repeatNames;
        TreeMap<Integer, List<String>> reverseSortTreeMap = new TreeMap<>(Collections.reverseOrder());
        for (Integer quantityCounts : map.values()) {
            for (Map.Entry<String, Integer> namesCount : map.entrySet()) {
                if (quantityCounts.equals(namesCount.getValue())) {
                    tempRepeatNames.add(namesCount.getKey());
                }
            }
            repeatNames = new ArrayList<>(tempRepeatNames);
            reverseSortTreeMap.put(quantityCounts, repeatNames);
            tempRepeatNames.clear();
        }
        System.out.println(reverseSortTreeMap + " - Отсортированные по убыванию популярности.");
    }
}

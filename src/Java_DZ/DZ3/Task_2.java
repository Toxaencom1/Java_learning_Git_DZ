package Java_DZ.DZ3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//2.Пусть дан произвольный список целых чисел, удалить из него четные числа

public class Task_2 {
    public static void main(String[] args) {
        List<Integer> randomList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов списка: ");
        int n = scanner.nextInt();
        scanner.close();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            randomList.add(random.nextInt(0,100));
        }
        System.out.println(randomList+" - Произволный список");
        randomList.removeIf(s -> s%2==0);
        System.out.println(randomList+" - Список без четных чисел");
    }
}

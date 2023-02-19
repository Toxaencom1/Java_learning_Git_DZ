package Java_DZ.DZ3;

import java.util.ArrayList;
import java.util.List;

//1.Реализовать алгоритм сортировки слиянием
public class Task_1 {
    static public List<Integer> mergeList(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i) < right.get(j)) {
                result.add(left.get(i));
                i++;
                if (i == left.size()) {
                    while (j < right.size()) {
                        result.add(right.get(j));
                        j++;
                    }
                }
            } else {
                result.add(right.get(j));
                j++;
                if (j == right.size()) {
                    while (i < left.size()) {
                        result.add(left.get(i));
                        i++;
                    }
                }
            }
        }
        return result;
    }


    static public List<Integer> mergeSort(List<Integer> source) {
        int middle = (source.size()) / 2;
        List<Integer> left = source.subList(0, middle);
        List<Integer> right = source.subList(middle, source.size());
        if (left.size() > 1) {
            left = mergeSort(left);
        }
        if (right.size() > 1) {
            right = mergeSort(right);
        }
        return mergeList(left, right);
    }


    public static void main(String[] args) {
        List<Integer> needToSortList = new ArrayList<>();
        //2 8 3 7 6 4 5 1
        needToSortList.add(2);
        needToSortList.add(8);
        needToSortList.add(3);
        needToSortList.add(7);
        needToSortList.add(6);
        needToSortList.add(4);
        needToSortList.add(5);
        needToSortList.add(1);
        System.out.println(needToSortList+" - Исходный список");
        List<Integer> sortedList = mergeSort(needToSortList);
        System.out.println(sortedList+" - Отсортированыый методом слияния: ");
    }
}

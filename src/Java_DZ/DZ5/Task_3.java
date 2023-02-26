package Java_DZ.DZ5;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//*Реализовать алгоритм пирамидальной сортировки (HeapSort)
public class Task_3 {
    static int validatePosInt() {
        System.out.print("Введите n число элементов: ");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                if (n > 0 && n < 2_147_483_647) {
                    return n;
                } else System.out.print("Введи коректное число: ");
            } catch (Exception ex) {
                System.out.print("Введи 'число!', больше нуля: ");
            }
        }
    }
    public static void main(String[] args) {
        int len = validatePosInt();
        int[] array = new int[len];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]= random.nextInt(1,100);
        }
        System.out.println(Arrays.toString(array) + " - Source array");
        heapSort(array);
        System.out.println(Arrays.toString(array)+ " - Heap Sorted array");
    }

    private static void heapSort(int[] array) {
        int len = array.length;
        for (int i = len / 2 - 1; i >= 0; i--) {
            parentBiggerValueInBranch(array, i, len);
        }
        for (int i = len - 1; i >= 0; i--) {
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            parentBiggerValueInBranch(array, 0, i);
        }
    }

    private static void parentBiggerValueInBranch(int[] array, int i, int len) {
        int leftChild = i * 2 + 1;
        int rightChild = i * 2 + 2;
        int biggerValue = i;

        if (leftChild < len && array[leftChild] > array[biggerValue]) {
            biggerValue = leftChild;
        }
        if (rightChild < len && array[rightChild] > array[biggerValue]) {
            biggerValue = rightChild;
        }
        if (i != biggerValue) {
            int temp = array[i];
            array[i] = array[biggerValue];
            array[biggerValue] = temp;
            parentBiggerValueInBranch(array, biggerValue, len);
        }
    }
}

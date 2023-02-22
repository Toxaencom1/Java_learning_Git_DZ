package Java_DZ.DZ4;

import java.util.Iterator;
import java.util.LinkedList;

//Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
public class Task_3 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        System.out.println(linkedList+" - Source linkedList");

        int summ = 0;
        Iterator<Integer> col = linkedList.iterator();
        while (col.hasNext()){
            summ+=col.next();
        }
        System.out.println(summ + " - Summ of elments");
        System.out.println(linkedList+" - Still the original linkedList");
    }
}

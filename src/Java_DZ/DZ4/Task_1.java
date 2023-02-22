package Java_DZ.DZ4;

import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
// Постараться не обращаться к листу по индексам.
public class Task_1 {
    public static LinkedList<Integer> reverse(LinkedList<Integer> linkedList){
        LinkedList<Integer> linkedListReverse = new LinkedList<>();
        while (linkedList.size()>0){
            linkedListReverse.addFirst(linkedList.pop());
        }
        return linkedListReverse;
    }
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addLast(6);
        linkedList.addLast(7);
        linkedList.addLast(8);
        System.out.println(linkedList + " - Source linkedList");
        linkedList = reverse(linkedList);
        System.out.println(linkedList + " - Reverse linkedList");
    }
}

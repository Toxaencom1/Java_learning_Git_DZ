package Java_DZ.DZ4;

import java.util.LinkedList;

public class MyQueueLinkedList {
    private LinkedList<Integer> linkedList = new LinkedList<>();


    void enqueue(Integer value) {
        linkedList.addLast(value);
    }

    Integer dequeue() {
        if (linkedList.size()>0){
            return linkedList.pollFirst();
        }
        return null;
    }

    Integer first(){
        if (linkedList.size()>0){
        return linkedList.peekFirst();
        }
        return null;
    }

    void show(String description){
        if (linkedList.size()>0){
            System.out.println(linkedList + " - " + description);
        }else System.out.println("linkedList is empty");
    }
}


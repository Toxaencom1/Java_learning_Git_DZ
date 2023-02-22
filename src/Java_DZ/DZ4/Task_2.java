package Java_DZ.DZ4;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
public class Task_2 {
    public static void main(String[] args) {
        MyQueueLinkedList queueLinkedList = new MyQueueLinkedList();
        queueLinkedList.enqueue(1);
        queueLinkedList.enqueue(2);
        queueLinkedList.enqueue(3);
        queueLinkedList.enqueue(4);
        queueLinkedList.enqueue(5);
        queueLinkedList.show("Source");

        System.out.println(queueLinkedList.dequeue() + " - First element");
        queueLinkedList.show("First element was deleted from source linkedList");

        System.out.println(queueLinkedList.first() + " - First element");
        queueLinkedList.show("First element without delete from linkedList");
    }
}

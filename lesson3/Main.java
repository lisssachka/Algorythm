package Lesson3.lesson3.src.main.java.ru.geekbrains;

public class Main {

    public static void main(String[] args) {
//        LinkedList linkedList = new LinkedList();
//        linkedList.addFirst(1);
//        linkedList.addFirst(20);
//        linkedList.addFirst(11);
//        linkedList.addFirst(26);
//
//        linkedList.printList();
//        linkedList.addLast(15);
//        linkedList.addLast(18);
//        linkedList.printList();
//
////        System.out.println("linkedList.contains(26) = " + linkedList.contains(26));
////        System.out.println("linkedList.contains(86) = " + linkedList.contains(86));
//
//        linkedList.removeLast();
//        linkedList.printList();
//        linkedList.removeFirst();
//        linkedList.printList();
        LinkedList2 doubleList = new LinkedList2();
        doubleList.addFirst(1);
        doubleList.addFirst(21);
        doubleList.addFirst(154);
        doubleList.addFirst(11);
 //       doubleList.printList();
        doubleList.addLast(2);
        doubleList.addLast(42);
        doubleList.addLast(22);
        doubleList.addLast(21);
        doubleList.printList();
//        doubleList.removeFirst();
//        doubleList.printList();
//        doubleList.removeLast();
//        doubleList.printList();
        doubleList.revertList();
        doubleList.printList();
    }
}
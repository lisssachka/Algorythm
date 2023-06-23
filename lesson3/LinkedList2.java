package Lesson3.lesson3.src.main.java.ru.geekbrains;

public class LinkedList2 {
    Node head;
    Node tail;

    public class Node {
        int value;
        Node next;
        Node previous;

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public void addFirst(int value) {
        Node newNode = new Node();
        newNode.value = value;

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void removeFirst() {
        if (head != null && head.next != null) {
            head = head.next;
            head.previous = null;
        } else{
            head = null;
            tail = null;
        }
    }

    /**
     * @param value передаваемое значение
     * @return
     * @apiNote проверка, есть ли элемент
     */
    public boolean contains(int value) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public void addLast(int value) {
        Node node = new Node();
        Node currentNode = head;
        node.value = value;
        if (tail != null) {
            tail.next = node;
            node.previous = tail;
            tail = node;
        } else {
            tail = node;
            head = node;
        }
    }

    public void removeLast() {
        if (tail != null && tail.previous != null) {
            tail.previous.next = null;
            tail = tail.previous;
        }
    }
    public void revertList() {

        Node currentNode = head;

        while (currentNode != null) {
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;

            if (previous == null) {
                tail = currentNode;
            }

            if (next == null) {
                head = currentNode;
            }

            currentNode = next;
        }
    }

}

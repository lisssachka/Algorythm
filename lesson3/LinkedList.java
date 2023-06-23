package Lesson3.lesson3.src.main.java.ru.geekbrains;

public class LinkedList {
    Node head;

    public class Node {
        int value;
        Node next;

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
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
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
        if (head == null) {
            head = node;
        } else {
                while (currentNode.next != null) {
                    currentNode = currentNode.next;
                }
            currentNode.next = node;
            }
        }


    public void removeLast() {
        if (head != null) {
            Node currentNode = head;
            if (currentNode.next == null){
                head = null;
            }
            while (currentNode.next != null) {
                if (currentNode.next.next == null) {
                    currentNode.next = null;
                    return;
                }
                currentNode = currentNode.next;
            }
        }
    }
}
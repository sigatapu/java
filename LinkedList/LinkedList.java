package LinkedList;

public class LinkedList {
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length = length + 1;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length = length + 1;
    }

    public void removeLast() {
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            tail = temp;
            temp.next = null;
        }
        length = length - 1;
    }

    public void removeFirst() {
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
        length = length - 1;
    }

    public void get(int index) {
        Node temp = head;
        for (int i = 0; i <= index - 1; i++) {
            temp = temp.next;
        }
        System.out.println(temp.value);
    }

    public void set(int index, int value) {
        Node temp = head;
        for (int i = 0; i <= index - 1; i++) {
            temp = temp.next;
        }
        temp.value = value;
    }



}

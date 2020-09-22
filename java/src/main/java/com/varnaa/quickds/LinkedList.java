package com.varnaa.quickds;

import java.util.Random;

/**
 * @Author: swethavarnaa
 */
class LinkedList {
    private final int LENGTH = 10;
    private final int BOUND = 20;
    private final Random RANDOM = new Random();
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    void insertNode(int value) {
        if (isEmpty()) {
            head = new Node(value);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(value);
        }
    }

    public Node getHead() {
        return head;
    }

    public Node createRandomLinkedList() {
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < LENGTH; i++) {
            linkedList.insertNode(RANDOM.nextInt(BOUND));
        }

        return linkedList.getHead();
    }


    public void prettyPrint(Node head) {
        StringBuilder output = new StringBuilder();
        while (head != null) {
            output.append(head.value).append(" -> ");
            head = head.next;
        }
        output.append("null");
        System.out.println(output.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LinkedList that = (LinkedList) o;

        return head.equals(that.head);
    }

    @Override
    public int hashCode() {
        return head.hashCode();
    }
}

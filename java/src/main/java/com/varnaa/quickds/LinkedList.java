package com.varnaa.quickds;

import java.util.Random;

/**
 * @Author: swethavarnaa
 */
class LinkedList {
    private int LENGTH = 10;
    private final int BOUND = 20;
    private final Random RANDOM = new Random();
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    protected boolean isEmpty() {
        return this.head == null;
    }

    protected void insertNode(int value) {
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

    protected Node getHead() {
        return head;
    }

    protected Node createRandomLinkedList() {
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < LENGTH; i++) {
            linkedList.insertNode(RANDOM.nextInt(BOUND));
        }

        return linkedList.getHead();
    }


    protected void prettyPrint(Node head) {
        StringBuilder output = new StringBuilder();
        while (head != null) {
            output.append(head.value).append(" -> ");
            head = head.next;
        }
        output.append("null");
        System.out.println(output.toString());
    }

    protected void setLENGTH(int LENGTH) {
        this.LENGTH = LENGTH;
    }

}

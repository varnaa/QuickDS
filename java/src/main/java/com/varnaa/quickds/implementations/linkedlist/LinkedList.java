package com.varnaa.quickds.implementations.linkedlist;

import com.varnaa.quickds.implementations.prettyPrint.PrettyPrint;

import java.util.Random;

/**
 * @Author: swethavarnaa
 */
public class LinkedList implements PrettyPrint<Node> {
    private final int LENGTH = 10;
    private final Random RANDOM = new Random();
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void insertNode(int value) {
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
            linkedList.insertNode(RANDOM.nextInt(10));
        }

        return linkedList.getHead();
    }


    @Override
    public void prettyPrint(Node head) {
        StringBuilder output = new StringBuilder();
        while (head != null) {
            output.append(head.value).append(" -> ");
        }
        output.append("null");
        System.out.println(output.toString());
    }
}

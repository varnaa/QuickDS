package com.varnaa.test;

import com.varnaa.quickds.InputFormatter;
import com.varnaa.quickds.LinkedList;
import com.varnaa.quickds.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author: swethavarnaa
 */
public class LinkedListTest {

    private final LinkedList linkedList = new LinkedList();
    private final InputFormatter inputFormatter = new InputFormatter();

    @Test
    public void createRandomLinkedListTest() {
        Node node = linkedList.createRandomLinkedList();
        Assertions.assertTrue(node != null);
    }

    @Test
    public void formatLinkedListTest() {

        // String input
        String input = "[1,2,3,4,5]";

        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);


        Node generatedHead = inputFormatter.formatToLinkedList(input);
        Assertions.assertEquals(node, generatedHead);


        // array input
        int[] inputArray = new int[]{1, 2, 3, 4, 5};
        Assertions.assertEquals(node, inputFormatter.formatToLinkedList(inputArray));

    }


}

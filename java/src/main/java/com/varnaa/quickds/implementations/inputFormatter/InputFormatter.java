package com.varnaa.quickds.implementations.inputFormatter;

import com.varnaa.quickds.implementations.linkedlist.LinkedList;
import com.varnaa.quickds.implementations.linkedlist.Node;

/**
 * @Author: swethavarnaa
 */
public class InputFormatter {
    private LinkedList linkedList;

    public int[] format1dArray(String input) {
        assert input != null : "input to format can not be null";
        input = input.replace("[", "").replace("]", "");
        String[] inputArray = input.split(",");
        int[] array = new int[inputArray.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.valueOf(inputArray[i]);
        }
        return array;
    }

    public char[][] format2dCharArray(String input, int rowLength, int colLength) {
        assert input != null : "input to format can not be null";
        input = input.replaceAll(",", "");
        System.out.println(input);
        char[][] grid = new char[rowLength][colLength];
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                grid[i][j] = input.charAt(i + j);
            }
        }
        return grid;
    }

    public int[][] format2dIntArray(String input, int rowLength, int colLength) {
        assert input != null : "input to format can not be null";
        input = input.replaceAll(",", "");
        int index = 0;
        int[][] matrix = new int[rowLength][colLength];
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                matrix[i][j] = input.charAt(index++) - '0';
            }
        }
        return matrix;
    }


    public Node formatLinkedList(String input) {

        assert input != null : "input to format can not be null";
        input = input.replace("[", "").replace("]", "");
        String[] inputArray = input.split(",");

        linkedList = new LinkedList();
        for (String number : inputArray) {
            linkedList.insertNode(Integer.valueOf(number));
        }

        return linkedList.getHead();
    }
}

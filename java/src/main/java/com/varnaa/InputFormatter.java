package com.varnaa;

import java.util.Arrays;

/**
 * @Author: swethavarnaa
 */
class InputFormatter {
    private LinkedList linkedList;
    private BinarySearchTree binarySearchTree;


    protected int[] format1dArray(String input) {
        assert input != null : "input to format can not be null";
        input = input.replace("[", "").replace("]", "");
        input = input.replaceAll(" ", "");
        String[] inputArray = input.split(",");
        int[] array = new int[inputArray.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(inputArray[i]);
        }
        return array;
    }

    protected char[][] format2dCharArray(String input, int rowLength, int colLength) {
        assert input != null : "input to format can not be null";
        input = input.replace("[", "").replace("]", "");
        input = input.replaceAll("'", "");
        input = input.replaceAll(" ", "");
        input = input.replaceAll(",", "");
        int index = 0;
        char[][] grid = new char[rowLength][colLength];
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                grid[i][j] = input.charAt(index++);
            }
        }
        return grid;
    }

    protected int[][] format2dIntArray(String input, int rowLength, int colLength) {
        assert input != null : "input to format can not be null";
        input = input.replace("[", "").replace("]", "");
        input = input.replaceAll(" ", "");
        String[] inputArray = input.split(",");
        int index = 0;
        int[][] matrix = new int[rowLength][colLength];
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                matrix[i][j] = Integer.parseInt(inputArray[index++]);
            }
        }
        return matrix;
    }


    protected Node formatToLinkedList(String input) {

        assert input != null : "input to format can not be null";
        input = input.replace("[", "").replace("]", "");
        input = input.replaceAll(" ", "");
        String[] inputArray = input.split(",");
        System.out.println(Arrays.toString(inputArray));
        linkedList = new LinkedList();
        for (String number : inputArray) {
            linkedList.insertNode(Integer.parseInt(number));
        }

        return linkedList.getHead();
    }

    protected Node formatToLinkedList(int[] array) {
        assert array != null : "input array cant be null, should contain at least one value";
        linkedList = new LinkedList();
        for (int j : array) {
            linkedList.insertNode(j);
        }
        return linkedList.getHead();
    }

    protected TreeNode formatBST(String input) {
        binarySearchTree = new BinarySearchTree();
        input = input.replace("[", "").replace("]", "");
        input = input.replaceAll(" ", "");
        return binarySearchTree.deserialize(input);
    }


}

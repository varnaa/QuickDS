package com.varnaa.quickds;

/**
 * @Author: swethavarnaa
 */
class InputFormatter {
    private LinkedList linkedList;

    public int[] format1dArray(String input) {
        assert input != null : "input to format can not be null";
        input = input.replace("[", "").replace("]", "");
        String[] inputArray = input.split(",");
        int[] array = new int[inputArray.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(inputArray[i]);
        }
        return array;
    }

    public char[][] format2dCharArray(String input, int rowLength, int colLength) {
        assert input != null : "input to format can not be null";
        input = input.replace("[", "").replace("]", "");
        input = input.replaceAll("'", "");
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

    public int[][] format2dIntArray(String input, int rowLength, int colLength) {
        assert input != null : "input to format can not be null";
        input = input.replace("[", "").replace("]", "");
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


    public Node formatToLinkedList(String input) {

        assert input != null : "input to format can not be null";
        input = input.replace("[", "").replace("]", "");
        String[] inputArray = input.split(",");

        linkedList = new LinkedList();
        for (String number : inputArray) {
            linkedList.insertNode(Integer.parseInt(number));
        }

        return linkedList.getHead();
    }

    public Node formatToLinkedList(int[] array) {
        assert array != null : "input array cant be null, should contain at least one value";
        linkedList = new LinkedList();
        for (int j : array) {
            linkedList.insertNode(j);
        }
        return linkedList.getHead();
    }

}

package com.varnaa;

import java.util.Random;

/**
 * @Author: swethavarnaa
 */
class Array {

    private final int BOUND = 10;
    private final int ROW_LENGTH = 4;
    private final int COL_LENGTH = 4;
    private final int DEFAULT_SIZE = 10;
    private final Random RANDOM = new Random();


    protected int[] createRandomArray() {

        int[] array = new int[DEFAULT_SIZE];
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            array[i] = RANDOM.nextInt(BOUND);
        }

        return array;
    }

    protected int[] createRandomArray(int size) {

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = RANDOM.nextInt(BOUND);
        }

        return array;
    }

    protected int[][] createRandom2DArray() {
        int[][] array = new int[ROW_LENGTH][COL_LENGTH];
        for (int i = 0; i < ROW_LENGTH; i++) {
            for (int j = 0; j < COL_LENGTH; j++) {
                array[i][j] = RANDOM.nextInt(BOUND);
            }
        }
        return array;
    }

    protected int[][] createRandom2DArray(int rowLength, int colLength) {
        int[][] array = new int[rowLength][colLength];
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                array[i][j] = RANDOM.nextInt(BOUND);
            }
        }
        return array;
    }

    protected void prettyPrint(int[] array) {
        StringBuilder output = new StringBuilder("{");
        for (int i : array)
            output.append(i).append(",");
        output.append("}");
        System.out.println(output.toString());
    }

    protected void prettyPrint(int[][] array) {
        StringBuilder output = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            output.append("[");
            for (int j = 0; j < array[0].length; j++) {
                output.append(array[i][j]).append(",");
            }
            output.append("]");
        }
        output.append("]");
        System.out.println(output.toString());
    }
}

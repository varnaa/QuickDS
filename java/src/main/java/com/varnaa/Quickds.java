package com.varnaa;

/**
 * @Author: swethavarnaa
 */
public class Quickds {
    private final Array array;
    private final LinkedList linkedList;
    private final InputFormatter inputFormatter;
    private final BinarySearchTree binarySearchTree;

    public Quickds() {
        this.array = new Array();
        this.linkedList = new LinkedList();
        this.inputFormatter = new InputFormatter();
        this.binarySearchTree = new BinarySearchTree();
    }


    public void print1dArray(int[] input) {
        this.array.prettyPrint(input);
    }

    public void print2dArray(int[][] input) {
        this.array.prettyPrint(input);
    }

    public int[] createRandom1dArray() {
        return this.array.createRandomArray();
    }

    public int[] createCustom1dArray(int size) {
        return this.array.createRandomArray(size);
    }

    public int[] formatTo1dArray(String input) {
        return this.inputFormatter.format1dArray(input);
    }

    public int[][] createRandom2dArray() {
        return this.array.createRandom2DArray();
    }

    public int[][] createCustom2dArray(int rowLength, int colLength) {
        return this.array.createRandom2DArray(rowLength, colLength);
    }

    public int[][] formatTo2dIntArray(String input, int rowLength, int colLength) {
        return this.inputFormatter.format2dIntArray(input, rowLength, colLength);
    }

    public char[][] formatTo2dCharArray(String input, int rowLength, int colLength) {
        return this.inputFormatter.format2dCharArray(input, rowLength, colLength);
    }

    public void printLinkedList(Node head) {
        this.linkedList.prettyPrint(head);
    }

    public Node createRandomLinkedList() {
        return this.linkedList.createRandomLinkedList();
    }

    public Node createCustomLinkedList(int length) {
        this.linkedList.setLENGTH(length);
        return this.linkedList.createRandomLinkedList();
    }

    public Node formatArrayToLinkedList(int[] array) {
        return this.inputFormatter.formatToLinkedList(array);
    }

    public Node formatStringToLinkedList(String input) {
        return this.inputFormatter.formatToLinkedList(input);
    }

    public TreeNode createRandomBST() {
        return this.binarySearchTree.createRandomBinarySearchTree();
    }

    public TreeNode createCustomBST(int numberOfNodes) {
        this.binarySearchTree.setHeight(numberOfNodes);
        return binarySearchTree.createRandomBinarySearchTree();
    }

    public TreeNode createBSTFromSortedArray(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("sorted Array can not be empty or null");
        }
        return this.binarySearchTree.convertSortedArrayToBST(array, 0, array.length);
    }

    public TreeNode formatStringToBST(String input) {
        return this.inputFormatter.formatBST(input);
    }

    public void prettyPrintBST(TreeNode root) {
        this.binarySearchTree.prettyPrint("", root, false);
    }

    public void printBST(TreeNode root) {
        this.binarySearchTree.printBSt(root);
    }

}

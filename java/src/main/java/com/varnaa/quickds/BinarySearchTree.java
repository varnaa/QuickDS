package com.varnaa.quickds;

import java.util.LinkedList;
import java.util.*;

/**
 * @Author: swethavarnaa
 */

class BinarySearchTree {
    private final Random random = new Random();
    private int height = 23;
    private TreeNode root;

    private TreeNode getRoot() {
        return this.root;
    }

    private void setRoot(TreeNode root) {
        this.root = root;
    }

    private TreeNode insertNode(TreeNode root, String value) {
        if (!value.contentEquals("null")) {
            if (root == null) {
                root = new TreeNode(Integer.parseInt(value));
                return root;

            }
            if (Integer.parseInt(value) < root.value) {
                root.left = insertNode(root.left, value);
                return root.left;
            } else if (Integer.parseInt(value) > root.value) {
                root.right = insertNode(root.right, value);
                return root.right;
            }
        }

        return null;
    }

    public TreeNode createRandomBinarySearchTree() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        int[] randomNumbers = random.ints(1, 100).distinct().limit(height).toArray();
        Arrays.sort(randomNumbers);
        binarySearchTree.setRoot(convertSortedArrayToBST(randomNumbers, 0, randomNumbers.length - 1));
        return binarySearchTree.getRoot();

    }

    public TreeNode convertSortedArrayToBST(int[] randomNumbers, int lowerBound, int upperBound) {
        if (lowerBound > upperBound) return null;

        int middle = lowerBound + (upperBound - lowerBound) / 2;
        TreeNode root = new TreeNode(randomNumbers[middle]);
        root.left = convertSortedArrayToBST(randomNumbers, lowerBound, middle - 1);
        root.right = convertSortedArrayToBST(randomNumbers, middle + 1, upperBound);
        return root;
    }

    public String[] serialize(TreeNode root) {
        if (root == null)
            System.out.println("[]");
        List<String> bstList = new LinkedList<>();
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int currentSize = queue.size();
            List<String> level = new LinkedList<>();
            for (int i = 0; i < currentSize; i++) {
                TreeNode current = queue.poll();
                if (current != null) {
                    level.add(String.valueOf(current.value));
                } else {
                    level.add(null);
                }
                if (current != null) {
                    queue.offer(current.left);
                    queue.offer(current.right);
                }
            }
            bstList.addAll(level);
        }

        String[] bstArray = new String[bstList.size()];
        for (int i = 0; i < bstArray.length; i++) {
            bstArray[i] = bstList.get(i);
        }
        return bstArray;
    }

    public TreeNode deserialize(String[] input, BinarySearchTree binarySearchTree) {
        System.out.println("Input From deserialize: " + Arrays.toString(input));
        Deque<TreeNode> queue = new LinkedList<>();
        TreeNode root = binarySearchTree.getRoot();
        root = binarySearchTree.insertNode(root, input[0]);
        queue.offer(root);

        for (int i = 1; i < input.length; i++) {
            TreeNode parent = queue.poll();
            if (parent != null) {
                parent.left = binarySearchTree.insertNode(parent, input[i]);
                queue.offer(parent.left);
                ++i;
                parent.right = binarySearchTree.insertNode(parent, input[i]);
                queue.offer(parent.right);
            }
        }
        return root;
    }

    public void prettyPrint(String prefix, TreeNode root, boolean isLeft) {
        if (root != null) {
            System.out.println(prefix + (isLeft ? "|-- " : "\\-- ") + root.value);
            prettyPrint(prefix + (isLeft ? "|   " : "    "), root.left, true);
            prettyPrint(prefix + (isLeft ? "|   " : "    "), root.right, false);
        }
    }

    public void printBSt(TreeNode root) {
        String[] array = serialize(root);
        int index = array.length - 1;
        while (array[index] == null) {
            index--;
        }
        StringBuilder output = new StringBuilder("[");
        for (int i = 0; i < index; i++) {
            output.append(array[i]).append(",");
        }
        output.append(array[index]).append("]");

        System.out.println(output.toString());
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

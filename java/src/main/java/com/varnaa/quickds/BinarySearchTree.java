package com.varnaa.quickds;

import java.util.LinkedList;
import java.util.*;

/**
 * @Author: swethavarnaa
 */

class BinarySearchTree {
    private final Random random = new Random();
    private final int HEIGHT = 11;
    private TreeNode root;

    private TreeNode getRoot() {
        return this.root;
    }

    private void setRoot(TreeNode root) {
        this.root = root;
    }

    private TreeNode insertNode(TreeNode root, String value) {
        if (value != null) {
            if (this.root == null) {
                root = new TreeNode(Integer.parseInt(value));
                return root;

            } else {
                if (Integer.parseInt(value) < root.value) {
                    root.left = insertNode(root.left, value);
                } else {
                    root.right = insertNode(root.right, value);
                }
            }
        }

        return null;
    }

    public TreeNode createRandomBinarySearchTree() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        int[] randomNumbers = random.ints(1, 100).distinct().limit(HEIGHT).toArray();
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
                queue.offer(current.left);
                queue.offer(current.right);
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
        Deque<TreeNode> queue = new LinkedList<>();
        TreeNode root = binarySearchTree.getRoot();
        root = insertNode(root, input[0]);
        queue.offer(root);

        for (int i = 1; i < input.length; i++) {
            TreeNode parent = queue.poll();
            parent.left = binarySearchTree.insertNode(root, input[i]);
            queue.offer(parent.left);
            ++i;
            parent.right = binarySearchTree.insertNode(root, input[i]);
            queue.offer(parent.right);
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
        System.out.println(Arrays.toString(array));
    }


}

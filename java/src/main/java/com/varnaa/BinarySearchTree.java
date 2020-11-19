package com.varnaa;

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

    protected TreeNode createRandomBinarySearchTree() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        int[] randomNumbers = random.ints(1, 100).distinct().limit(height).toArray();
        Arrays.sort(randomNumbers);
        binarySearchTree.setRoot(convertSortedArrayToBST(randomNumbers, 0, randomNumbers.length - 1));
        return binarySearchTree.getRoot();

    }

    protected TreeNode deserialize(String data) {
        if (data.isEmpty())
            return null;

        List<Integer> nodes = new ArrayList<>();
        for (String node : data.split(",")) {
            if (node.contentEquals("null")) {
                nodes.add(null);
            } else {
                nodes.add(Integer.valueOf(node));
            }
        }

        return buildTree(nodes);
    }

    private TreeNode buildTree(List<Integer> nodes) {
        if (nodes.isEmpty()) {
            return null;
        }

        int index = 0, length = nodes.size();
        Deque<TreeNode> queue = new ArrayDeque<>();
        TreeNode root = new TreeNode(nodes.get(index++));
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();

                if (index < length && nodes.get(index) != null) {
                    current.left = new TreeNode(nodes.get(index));
                    queue.offer(current.left);
                }
                index++;
                if (index < length && nodes.get(index) != null) {
                    current.right = new TreeNode(nodes.get(index));
                    queue.offer(current.right);
                }
                index++;
            }
        }

        return root;
    }


    protected TreeNode convertSortedArrayToBST(int[] randomNumbers, int lowerBound, int upperBound) {
        if (lowerBound > upperBound) return null;

        int middle = lowerBound + (upperBound - lowerBound) / 2;
        TreeNode root = new TreeNode(randomNumbers[middle]);
        root.left = convertSortedArrayToBST(randomNumbers, lowerBound, middle - 1);
        root.right = convertSortedArrayToBST(randomNumbers, middle + 1, upperBound);
        return root;
    }


    protected void prettyPrint(String prefix, TreeNode root, boolean isLeft) {
        if (root != null) {
            System.out.println(prefix + (isLeft ? "|-- " : "\\-- ") + root.value);
            prettyPrint(prefix + (isLeft ? "|   " : "    "), root.left, true);
            prettyPrint(prefix + (isLeft ? "|   " : "    "), root.right, false);
        }
    }

    protected void printBSt(TreeNode root) {
        System.out.println(levelOrder(root));
    }

    protected void setHeight(int height) {
        this.height = height;
    }

    protected String levelOrder(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();
        result.append("[");
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                result.append(current.value).append(" ");

                if (current.left != null) {
                    queue.offer(current.left);
                }

                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
        }
        result.append("]");
        return result.toString();
    }

}

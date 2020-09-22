package com.varnaa.quickds;

/**
 * @Author: swethavarnaa
 */
public class Node {
    public int value;
    public Node next;

    public Node() {
    }

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        if (value != node.value) return false;
        return next != null ? next.equals(node.next) : node.next == null;
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }
}

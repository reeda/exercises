package com.github.reeda.exercises.list;

/**
 * Created by areed on 3/27/16.
 */
public class Node<T> {

    public T value;
    public Node<T> next = null;

    public Node(T value) {
        this.value = value;
    }

    public boolean hasNext() {
        return next != null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toStringHelper(this, sb);
        return sb.toString();
    }

    private void toStringHelper(Node<T> curr, StringBuilder sb) {
        if (curr == null) {
            return;
        }
        sb.append(curr.value);
        toStringHelper(curr.next, sb);
    }
}

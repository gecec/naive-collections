package org.gael.naive.structures;

import org.gael.naive.EmptyStackException;

public class Stack<T> {
    private Node last;
    private int size = 0;

    public void push(T data){
        if (last == null){
            last = new Node(data);
        } else {
            Node temp = last;
            Node newNode = new Node(data);
            newNode.setPrev(temp);
            last = newNode;
        }

        size++;
    }

    public T pop () throws EmptyStackException {
        if (last == null) throw new EmptyStackException();
        Node temp = last;
        last = last.prev;
        size--;
        return temp.getData();
    }

    public int size(){
        return size;
    }

    public void print(){
        Node node = last;
        while(node != null){
            System.out.println("Node: " + node.getData().toString());
            node = node.getPrev();
        }
    }

    private final class Node {
        private T data;
        private Node prev;

        public Node() {
        }

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }
}
